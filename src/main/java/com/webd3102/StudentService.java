package com.webd3102;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;

@Path("students")
public class StudentService {

    private static ArrayList<Student> students = new ArrayList<Student>();

    private ArrayList<Student> getStudents() {

        if(students.isEmpty()){
            students.add(new Student("Philip", "Fry","W003000"));
            students.add(new Student("Bruce", "Wayne","W124323"));
            students.add(new Student("Tony", "Stark","W1403310"));
        }

        return students;
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Student> getAllStudents(){
        return getStudents();
    }


    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addStudent(Student student) {
        students.add(student);
        return Response.status(201).entity(student.toString()).build();
    }
}
