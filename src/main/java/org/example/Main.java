package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
/*

        Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("workintech","dummy desc","ann", Priority.HIGH, Status.IN_PROGRESS);
        Task taskAnn2 = new Task("workintech","dummy desc 2","ann", Priority.HIGH, Status.IN_PROGRESS);

        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);

        Set<Task> bobsTasks = new HashSet<>();
        Task bobsTask = new Task("workintech","dummy desc 3","bob", Priority.HIGH, Status.IN_PROGRESS);
        Task bobsTask2 = new Task("workintech","dummy desc 5","bob", Priority.HIGH, Status.IN_PROGRESS);

        bobsTasks.add(bobsTask);
        bobsTasks.add(bobsTask2);

        Set<Task> carolTasks = new HashSet<>();
        Task carolsTask = new Task("workintech","dummy desc 4","carol", Priority.HIGH, Status.IN_PROGRESS);
        Task carolsTask2 = new Task("workintech","dummy desc 3","carol", Priority.HIGH, Status.IN_PROGRESS);

        carolTasks.add(carolsTask);
        carolTasks.add(carolsTask2);

        Set<Task> unassignedTasks = new HashSet<>();
        Task unassignedTask = new Task("workintech","dummy desc 6",null, Priority.HIGH, Status.IN_PROGRESS);

        unassignedTasks.add(unassignedTask);


        TaskData taskData = new TaskData(annsTasks,bobsTasks,carolTasks,unassignedTasks);

        System.out.println("bobstasks: " + taskData.getTasks("bob"));
        System.out.println("anntasks: " + taskData.getTasks("ann"));
        System.out.println("alltasks: " + taskData.getTasks("all"));
        taskData.getIntersection(annsTasks,bobsTasks);
        taskData.getIntersection(annsTasks,carolTasks);
        taskData.getIntersection(bobsTasks,carolTasks);

        System.out.println("unassigned: "+taskData.getDifferences(unassignedTasks,taskData.getTasks("ann")));

*/


//        StringSet.findUniqueWords();
    }
}