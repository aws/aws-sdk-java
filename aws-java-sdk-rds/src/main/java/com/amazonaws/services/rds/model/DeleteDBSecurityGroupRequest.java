/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSecurityGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDBSecurityGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB security group to delete.
     * </p>
     * <note>
     * <p>
     * You can't delete the default DB security group.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default"
     * </p>
     * </li>
     * </ul>
     */
    private String dBSecurityGroupName;

    /**
     * Default constructor for DeleteDBSecurityGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DeleteDBSecurityGroupRequest() {
    }

    /**
     * Constructs a new DeleteDBSecurityGroupRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param dBSecurityGroupName
     *        The name of the DB security group to delete.</p> <note>
     *        <p>
     *        You can't delete the default DB security group.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not be "Default"
     *        </p>
     *        </li>
     */
    public DeleteDBSecurityGroupRequest(String dBSecurityGroupName) {
        setDBSecurityGroupName(dBSecurityGroupName);
    }

    /**
     * <p>
     * The name of the DB security group to delete.
     * </p>
     * <note>
     * <p>
     * You can't delete the default DB security group.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default"
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBSecurityGroupName
     *        The name of the DB security group to delete.</p> <note>
     *        <p>
     *        You can't delete the default DB security group.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not be "Default"
     *        </p>
     *        </li>
     */

    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }

    /**
     * <p>
     * The name of the DB security group to delete.
     * </p>
     * <note>
     * <p>
     * You can't delete the default DB security group.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default"
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB security group to delete.</p> <note>
     *         <p>
     *         You can't delete the default DB security group.
     *         </p>
     *         </note>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not be "Default"
     *         </p>
     *         </li>
     */

    public String getDBSecurityGroupName() {
        return this.dBSecurityGroupName;
    }

    /**
     * <p>
     * The name of the DB security group to delete.
     * </p>
     * <note>
     * <p>
     * You can't delete the default DB security group.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not be "Default"
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBSecurityGroupName
     *        The name of the DB security group to delete.</p> <note>
     *        <p>
     *        You can't delete the default DB security group.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not be "Default"
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBSecurityGroupRequest withDBSecurityGroupName(String dBSecurityGroupName) {
        setDBSecurityGroupName(dBSecurityGroupName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
            sb.append("DBSecurityGroupName: ").append(getDBSecurityGroupName());
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
        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null)
            return false;
        if (other.getDBSecurityGroupName() != null && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDBSecurityGroupRequest clone() {
        return (DeleteDBSecurityGroupRequest) super.clone();
    }

}
