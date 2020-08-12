/*
 * #%L
 * Advanced Java LIVE course-2020
 * %%
 * Copyright (C) 2020 MasterDevSkills.com
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

package com.masterdevskills.cha1.ext1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * TODO : Write a file processor that would read text from a text file.
 * Discard the empty line
 * Log the count of the lines of the file
 * Write in another file
 */

public class FileProcessor {

    /**
     * Add your code in the following method
     * This method is supposed to read text from given file
     * and return the all the lines as a List of string
     *
     * @param fileName the filename
     *                 <p>
     *                 hints:
     * @see List#removeIf(Predicate)
     */
    public List<String> readFileFrom(String fileName) {
        List<String> listItems = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                listItems.add(scanner.nextLine());
            }
            scanner.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        // https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html#removeIf-java.util.function.Predicate-
        // If the predicate returns true, it will be removed from the list.
        // If the predicate returns false, it will not removed.
        listItems.removeIf(listItem -> listItem.length()<1);
        System.out.println(listItems);

        return listItems;
    }

    /**
     * TODO: Implement this method that takes a list of string and write in a file
     *
     * @param lines    list of string
     * @param fileName fileName to write
     *                 <p>
     *                 hints
     * @see String#join(CharSequence, CharSequence...)
     */
    public void writeToFile(List<String> lines, String fileName) {

        throw new RuntimeException("Not Yet Implemented");
    }
}

