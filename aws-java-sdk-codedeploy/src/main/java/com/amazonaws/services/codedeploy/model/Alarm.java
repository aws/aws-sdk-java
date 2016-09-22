/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an alarm.
 * </p>
 */
public class Alarm implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the alarm. Maximum length is 255 characters. Each alarm name can be used only once in a list of
     * alarms.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The name of the alarm. Maximum length is 255 characters. Each alarm name can be used only once in a list of
     * alarms.
     * </p>
     * 
     * @param name
     *        The name of the alarm. Maximum length is 255 characters. Each alarm name can be used only once in a list
     *        of alarms.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the alarm. Maximum length is 255 characters. Each alarm name can be used only once in a list of
     * alarms.
     * </p>
     * 
     * @return The name of the alarm. Maximum length is 255 characters. Each alarm name can be used only once in a list
     *         of alarms.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the alarm. Maximum length is 255 characters. Each alarm name can be used only once in a list of
     * alarms.
     * </p>
     * 
     * @param name
     *        The name of the alarm. Maximum length is 255 characters. Each alarm name can be used only once in a list
     *        of alarms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alarm withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Alarm == false)
            return false;
        Alarm other = (Alarm) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public Alarm clone() {
        try {
            return (Alarm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
