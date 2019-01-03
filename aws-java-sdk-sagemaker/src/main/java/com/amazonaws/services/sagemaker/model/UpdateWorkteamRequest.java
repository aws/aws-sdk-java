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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateWorkteam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkteamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the work team to update.
     * </p>
     */
    private String workteamName;
    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contain the updated work team members.
     * </p>
     */
    private java.util.List<MemberDefinition> memberDefinitions;
    /**
     * <p>
     * An updated description for the work team.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the work team to update.
     * </p>
     * 
     * @param workteamName
     *        The name of the work team to update.
     */

    public void setWorkteamName(String workteamName) {
        this.workteamName = workteamName;
    }

    /**
     * <p>
     * The name of the work team to update.
     * </p>
     * 
     * @return The name of the work team to update.
     */

    public String getWorkteamName() {
        return this.workteamName;
    }

    /**
     * <p>
     * The name of the work team to update.
     * </p>
     * 
     * @param workteamName
     *        The name of the work team to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkteamRequest withWorkteamName(String workteamName) {
        setWorkteamName(workteamName);
        return this;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contain the updated work team members.
     * </p>
     * 
     * @return A list of <code>MemberDefinition</code> objects that contain the updated work team members.
     */

    public java.util.List<MemberDefinition> getMemberDefinitions() {
        return memberDefinitions;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contain the updated work team members.
     * </p>
     * 
     * @param memberDefinitions
     *        A list of <code>MemberDefinition</code> objects that contain the updated work team members.
     */

    public void setMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        if (memberDefinitions == null) {
            this.memberDefinitions = null;
            return;
        }

        this.memberDefinitions = new java.util.ArrayList<MemberDefinition>(memberDefinitions);
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contain the updated work team members.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberDefinitions(java.util.Collection)} or {@link #withMemberDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param memberDefinitions
     *        A list of <code>MemberDefinition</code> objects that contain the updated work team members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkteamRequest withMemberDefinitions(MemberDefinition... memberDefinitions) {
        if (this.memberDefinitions == null) {
            setMemberDefinitions(new java.util.ArrayList<MemberDefinition>(memberDefinitions.length));
        }
        for (MemberDefinition ele : memberDefinitions) {
            this.memberDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contain the updated work team members.
     * </p>
     * 
     * @param memberDefinitions
     *        A list of <code>MemberDefinition</code> objects that contain the updated work team members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkteamRequest withMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        setMemberDefinitions(memberDefinitions);
        return this;
    }

    /**
     * <p>
     * An updated description for the work team.
     * </p>
     * 
     * @param description
     *        An updated description for the work team.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An updated description for the work team.
     * </p>
     * 
     * @return An updated description for the work team.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An updated description for the work team.
     * </p>
     * 
     * @param description
     *        An updated description for the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkteamRequest withDescription(String description) {
        setDescription(description);
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
        if (getWorkteamName() != null)
            sb.append("WorkteamName: ").append(getWorkteamName()).append(",");
        if (getMemberDefinitions() != null)
            sb.append("MemberDefinitions: ").append(getMemberDefinitions()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkteamRequest == false)
            return false;
        UpdateWorkteamRequest other = (UpdateWorkteamRequest) obj;
        if (other.getWorkteamName() == null ^ this.getWorkteamName() == null)
            return false;
        if (other.getWorkteamName() != null && other.getWorkteamName().equals(this.getWorkteamName()) == false)
            return false;
        if (other.getMemberDefinitions() == null ^ this.getMemberDefinitions() == null)
            return false;
        if (other.getMemberDefinitions() != null && other.getMemberDefinitions().equals(this.getMemberDefinitions()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkteamName() == null) ? 0 : getWorkteamName().hashCode());
        hashCode = prime * hashCode + ((getMemberDefinitions() == null) ? 0 : getMemberDefinitions().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkteamRequest clone() {
        return (UpdateWorkteamRequest) super.clone();
    }

}
