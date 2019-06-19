/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.pojos;

import java.util.List;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="aws-java-sdk-doc-attribute-table")
public class TestDocClass {
    private String id;
    private List<Map<String, ChildClass>> listOfMaps;
    private Map<String, List<ChildClass>> mapOfLists;

    @DynamoDBHashKey
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Map<String, ChildClass>> getListOfMaps() {
        return listOfMaps;
    }

    public void setListOfMaps(List<Map<String, ChildClass>> listOfMaps) {
        this.listOfMaps = listOfMaps;
    }

    public Map<String, List<ChildClass>> getMapOfLists() {
        return mapOfLists;
    }

    public void setMapOfLists(Map<String, List<ChildClass>> mapOfLists) {
        this.mapOfLists = mapOfLists;
    }

    @Override
    public boolean equals(Object obj) {
        TestDocClass other = (TestDocClass) obj;

        return (eq(id, other.id)
                        && eq(listOfMaps, other.listOfMaps)
                        && eq(mapOfLists, other.mapOfLists));
    }

    @Override
    public String toString() {
        return "{id=" + id + ", listOfMaps=" + listOfMaps + ", mapOfLists="
                       + mapOfLists + "}";
    }

    @DynamoDBDocument
    public static class ChildClass {

        private boolean bool;

        private ChildClass firstChild;
        private List<ChildClass> otherChildren;
        private Map<String, ChildClass> namedChildren;

        public boolean isBool() {
            return bool;
        }

        public void setBool(boolean bool) {
            this.bool = bool;
        }

        public ChildClass getFirstChild() {
            return firstChild;
        }

        public void setFirstChild(ChildClass firstChild) {
            this.firstChild = firstChild;
        }

        public List<ChildClass> getOtherChildren() {
            return otherChildren;
        }

        public void setOtherChildren(List<ChildClass> otherChildren) {
            this.otherChildren = otherChildren;
        }

        public Map<String, ChildClass> getNamedChildren() {
            return namedChildren;
        }

        public void setNamedChildren(Map<String, ChildClass> namedChildren) {
            this.namedChildren = namedChildren;
        }

        @Override
        public boolean equals(Object obj) {
            ChildClass other = (ChildClass) obj;

            return (eq(bool, other.bool)
                            && eq(firstChild, other.firstChild)
                            && eq(otherChildren, other.otherChildren)
                            && eq(namedChildren, other.namedChildren));
        }

        @Override
        public String toString() {
            return "{bool=" + bool + ", firstChild=" + firstChild
                           + ", otherChildren=" + otherChildren + ", namedChildren="
                           + namedChildren + "}";
        }
    }

    protected static <T> boolean eq(T one, T two) {
        if (one == null) {
            return (two == null);
        } else {
            return one.equals(two);
        }
    }
}


