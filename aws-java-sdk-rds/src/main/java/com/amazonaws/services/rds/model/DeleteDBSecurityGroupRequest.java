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

package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class DeleteDBSecurityGroupRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB security group to delete.
     * </p>
     * <note>You cannot delete the default DB security group.</note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>Must not be "Default"</li>
     * <li>Cannot contain spaces</li>
     * </ul>
     */
    private String dBSecurityGroupName;

    /**
     * Default constructor for DeleteDBSecurityGroupRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * the object after creating it.
     */
    public DeleteDBSecurityGroupRequest() {
    }

    /**
     * Constructs a new DeleteDBSecurityGroupRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param dBSecurityGroupName
     *        The name of the DB security group to delete. </p> <note>You cannot
     *        delete the default DB security group.</note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must be 1 to 255 alphanumeric characters</li>
     *        <li>First character must be a letter</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *        <li>Must not be "Default"</li>
     *        <li>Cannot contain spaces</li>
     */
    public DeleteDBSecurityGroupRequest(String dBSecurityGroupName) {
        setDBSecurityGroupName(dBSecurityGroupName);
    }

    /**
     * <p>
     * The name of the DB security group to delete.
     * </p>
     * <note>You cannot delete the default DB security group.</note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>Must not be "Default"</li>
     * <li>Cannot contain spaces</li>
     * </ul>
     * 
     * @param dBSecurityGroupName
     *        The name of the DB security group to delete. </p> <note>You cannot
     *        delete the default DB security group.</note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must be 1 to 255 alphanumeric characters</li>
     *        <li>First character must be a letter</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *        <li>Must not be "Default"</li>
     *        <li>Cannot contain spaces</li>
     */

    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }

    /**
     * <p>
     * The name of the DB security group to delete.
     * </p>
     * <note>You cannot delete the default DB security group.</note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>Must not be "Default"</li>
     * <li>Cannot contain spaces</li>
     * </ul>
     * 
     * @return The name of the DB security group to delete. </p> <note>You
     *         cannot delete the default DB security group.</note>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li>
     *         <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         <li>Must not be "Default"</li>
     *         <li>Cannot contain spaces</li>
     */

    public String getDBSecurityGroupName() {
        return this.dBSecurityGroupName;
    }

    /**
     * <p>
     * The name of the DB security group to delete.
     * </p>
     * <note>You cannot delete the default DB security group.</note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>Must not be "Default"</li>
     * <li>Cannot contain spaces</li>
     * </ul>
     * 
     * @param dBSecurityGroupName
     *        The name of the DB security group to delete. </p> <note>You cannot
     *        delete the default DB security group.</note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must be 1 to 255 alphanumeric characters</li>
     *        <li>First character must be a letter</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *        <li>Must not be "Default"</li>
     *        <li>Cannot contain spaces</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteDBSecurityGroupRequest withDBSecurityGroupName(
            String dBSecurityGroupName) {
        setDBSecurityGroupName(dBSecurityGroupName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDBSecurityGroupName() != null)
            sb.append("DBSecurityGroupName: " + getDBSecurityGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBSecurityGroupRequest == false)
            return false;
        DeleteDBSecurityGroupRequest other = (DeleteDBSecurityGroupRequest) obj;
        if (other.getDBSecurityGroupName() == null
                ^ this.getDBSecurityGroupName() == null)
            return false;
        if (other.getDBSecurityGroupName() != null
                && other.getDBSecurityGroupName().equals(
                        this.getDBSecurityGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBSecurityGroupName() == null) ? 0
                        : getDBSecurityGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDBSecurityGroupRequest clone() {
        return (DeleteDBSecurityGroupRequest) super.clone();
    }
}