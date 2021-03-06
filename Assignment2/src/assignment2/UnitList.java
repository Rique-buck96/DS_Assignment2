/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Enrique
 */
public class UnitList {

    private int student_ID;     //of 4 digits
    private int A1_result;      //0<= a1_mark<=20
    private int A2_result;      //0<= a2_mark<=30
    private int exam_result;    //0<= a3_mark<=50
    private UnitList next = null;

    private UnitList(int ID, int mark1, int mark2, int mark3) {
        if ((ID < 999) || (ID > 9999)) {
            return;
        }
        if ((mark1 < 0.0) || (mark1 > 20.0)) {
            return;
        }
        if ((mark2 < 0.0) || (mark2 > 30.0)) {
            return;
        }
        if ((mark3 < 0.0) || (mark1 > 50.0)) {
            return;
        }

        this.student_ID = ID;
        this.A1_result = mark1;
        this.A2_result = mark2;
        this.exam_result = mark3;
    }

    private static void highest_result(UnitList u_list) { // serach student with hishest overall result, of mark1+mark2+mark3
        if (u_list == null) {
            return;
        }

        UnitList highest_mark = u_list;
        for (UnitList curr = u_list.next; curr != null; curr = curr.next) {
            if (curr.A1_result + curr.A2_result + curr.exam_result
                    > highest_mark.A1_result + highest_mark.A2_result + highest_mark.exam_result) {
                highest_mark = curr;
            }
        }

        System.out.println("\nStudent with highest overall results is the one with Student_ID.: " + highest_mark.student_ID);
    }

    private static void print_unit_result(UnitList u_list) {
        if (u_list == null) {
            return;
        }

        System.out.println("Current linked list contains:");
        for (UnitList curr = u_list; curr != null; curr = curr.next) {
            System.out.println(" Student_ID.: " + curr.student_ID
                    + "\t A1: " + curr.A1_result
                    + "\t A2: " + curr.A2_result
                    + "\t Exam: " + curr.exam_result);
        }

        System.out.println();
    }

    /**
     * ************************INSERT****************
     */
    private static void insert_unit_result(UnitList u_list, int ID, int mark1, int mark2, int mark3) {

        UnitList new_node = new UnitList(ID, mark1, mark2, mark3);
// if empty list, insert as the only node
        if (u_list == null) {
            return;              // cannot insert anyway due to Void return - so we assume UnitList != null
        }
// For convenience,student records are listed in ascending order by the student_ID field.
        UnitList previous = null;
        UnitList curr = u_list;

        while (curr != null) //traverse the SLL
        {
            if (curr.student_ID >= ID) {
                break;       //insert here??
            }
            previous = curr;
            curr = curr.next;
        };
        if (curr == null) /* insert as the last */ {
            previous.next = new_node;
            return;
        }

        if (curr.student_ID == ID) // ID match, replace the unit marks
        {
            curr.A1_result = mark1;
            curr.A2_result = mark2;
            curr.exam_result = mark3;
            return;
        }
        if (previous == null) /*the new node to be inserted at the beginning */ {
            new_node.next = u_list;
            // due to void return, changing UnitList link would not work
            UnitList temp = new UnitList(0, 0, 0, 0);
            temp.student_ID = u_list.student_ID;
            temp.A1_result = u_list.A1_result;
            temp.A2_result = u_list.A2_result;
            temp.exam_result = u_list.exam_result;

            temp.next = u_list.next;

            u_list.student_ID = ID;
            u_list.A1_result = mark1;
            u_list.A2_result = mark2;
            u_list.exam_result = mark3;
            u_list.next = temp;
            return;
        }
// Otherwise i.e., curr.ID >ID and Previous!=null

        new_node.next = curr;
        previous.next = new_node;
        return;
    }

//Deletion of student record from list
    public static void delete_unit_result(UnitList u_list, int id) {
        if (u_list == null) return;
        
        UnitList prev = null;
        UnitList del = null;

        //search
        for (UnitList curr = u_list; curr != null; curr = curr.next) {
            if (curr.student_ID < id) {
                prev = curr;
            }
            if (curr.student_ID == id) {
                del = curr.next;   //if exists, delete student record
                prev.next = del;
            }
        }
    }

    //Traverse in descending order
    public static void SortDescendingOrder(UnitList u_list) {
        if (u_list == null || u_list.next == null) return;

        UnitList Second = u_list.next;
        UnitList Third = Second.next;

        Second.next = u_list;   //Second node points to head
        u_list.next = null;     //head of list is now empty

        if (Third == null) return;

        UnitList curr = Third;
        UnitList prev = Second;

        while (curr != null) {
            UnitList nextNode = curr.next;
            curr.next = prev;

            //repeat but reset previous and current nodes
            prev = curr;
            curr = nextNode;
        }
        u_list = prev;
       print_unit_result(u_list);   //print needs to be called here
    }

    public static void BuildLinkedList() {
        int[] unit1 = {1111, 17, 22, 30,
            1112, 10, 6, 50,
            1114, 14, 21, 30,
            1116, 8, 16, 35,
            1122, 11, 19, 40,
            1145, 9, 16, 20,
            1189, 20, 30, 50};

//build a link of a unit result
        //first unit node
        UnitList u_list = new UnitList(unit1[0], unit1[1], unit1[2], unit1[3]);
        UnitList curr = u_list;
        for (int i = 1; i <= 6; i++) // to build the rest of the list
        {
            UnitList one_node = new UnitList(unit1[i * 4], //student_ID
                    unit1[i * 4 + 1], //a1_mark
                    unit1[i * 4 + 2], //a2_mark
                    unit1[i * 4 + 3] //exam_mark
            );
            curr.next = one_node;
            curr = curr.next;
        }

        //print out the student results of unit 1
        print_unit_result(u_list);
        //fing hishest performance student
        highest_result(u_list);

        System.out.println("\nInsert a new record: ID: 1225, A1:17, A2 20, Exam: 20 \n");

        insert_unit_result(u_list, 1225, 17, 20, 20);

        print_unit_result(u_list);

        System.out.println("\nDelete student record: ID: 1116 \n");
        delete_unit_result(u_list, 1116);

        print_unit_result(u_list);

        System.out.println("\nDisplay list in descending order\n");
        SortDescendingOrder(u_list);

        
    }
}
