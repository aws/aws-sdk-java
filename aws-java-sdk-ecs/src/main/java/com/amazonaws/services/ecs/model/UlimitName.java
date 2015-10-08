/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

/**
 * Ulimit Name
 */
public enum UlimitName {
    
    Core("core"),
    Cpu("cpu"),
    Data("data"),
    Fsize("fsize"),
    Locks("locks"),
    Memlock("memlock"),
    Msgqueue("msgqueue"),
    Nice("nice"),
    Nofile("nofile"),
    Nproc("nproc"),
    Rss("rss"),
    Rtprio("rtprio"),
    Rttime("rttime"),
    Sigpending("sigpending"),
    Stack("stack");

    private String value;

    private UlimitName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return UlimitName corresponding to the value
     */
    public static UlimitName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("core".equals(value)) {
            return UlimitName.Core;
        } else if ("cpu".equals(value)) {
            return UlimitName.Cpu;
        } else if ("data".equals(value)) {
            return UlimitName.Data;
        } else if ("fsize".equals(value)) {
            return UlimitName.Fsize;
        } else if ("locks".equals(value)) {
            return UlimitName.Locks;
        } else if ("memlock".equals(value)) {
            return UlimitName.Memlock;
        } else if ("msgqueue".equals(value)) {
            return UlimitName.Msgqueue;
        } else if ("nice".equals(value)) {
            return UlimitName.Nice;
        } else if ("nofile".equals(value)) {
            return UlimitName.Nofile;
        } else if ("nproc".equals(value)) {
            return UlimitName.Nproc;
        } else if ("rss".equals(value)) {
            return UlimitName.Rss;
        } else if ("rtprio".equals(value)) {
            return UlimitName.Rtprio;
        } else if ("rttime".equals(value)) {
            return UlimitName.Rttime;
        } else if ("sigpending".equals(value)) {
            return UlimitName.Sigpending;
        } else if ("stack".equals(value)) {
            return UlimitName.Stack;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    