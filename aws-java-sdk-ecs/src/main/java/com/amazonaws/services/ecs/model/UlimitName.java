/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
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

package com.amazonaws.services.ecs.model;

/**
 * 
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
     *        real value
     * @return UlimitName corresponding to the value
     */
    public static UlimitName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("core".equals(value)) {
            return Core;
        } else if ("cpu".equals(value)) {
            return Cpu;
        } else if ("data".equals(value)) {
            return Data;
        } else if ("fsize".equals(value)) {
            return Fsize;
        } else if ("locks".equals(value)) {
            return Locks;
        } else if ("memlock".equals(value)) {
            return Memlock;
        } else if ("msgqueue".equals(value)) {
            return Msgqueue;
        } else if ("nice".equals(value)) {
            return Nice;
        } else if ("nofile".equals(value)) {
            return Nofile;
        } else if ("nproc".equals(value)) {
            return Nproc;
        } else if ("rss".equals(value)) {
            return Rss;
        } else if ("rtprio".equals(value)) {
            return Rtprio;
        } else if ("rttime".equals(value)) {
            return Rttime;
        } else if ("sigpending".equals(value)) {
            return Sigpending;
        } else if ("stack".equals(value)) {
            return Stack;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}