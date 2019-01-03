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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateWorkteam" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkteamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the work team. Use this name to identify the work team.
     * </p>
     */
    private String workteamName;
    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the Amazon Cognito user pool
     * that makes up the work team. For more information, see <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * All of the <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     * <code>ClientId</code> and <code>UserPool</code> values.
     * </p>
     */
    private java.util.List<MemberDefinition> memberDefinitions;
    /**
     * <p>
     * A description of the work team.
     * </p>
     */
    private String description;
    /** <p/> */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the work team. Use this name to identify the work team.
     * </p>
     * 
     * @param workteamName
     *        The name of the work team. Use this name to identify the work team.
     */

    public void setWorkteamName(String workteamName) {
        this.workteamName = workteamName;
    }

    /**
     * <p>
     * The name of the work team. Use this name to identify the work team.
     * </p>
     * 
     * @return The name of the work team. Use this name to identify the work team.
     */

    public String getWorkteamName() {
        return this.workteamName;
    }

    /**
     * <p>
     * The name of the work team. Use this name to identify the work team.
     * </p>
     * 
     * @param workteamName
     *        The name of the work team. Use this name to identify the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withWorkteamName(String workteamName) {
        setWorkteamName(workteamName);
        return this;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the Amazon Cognito user pool
     * that makes up the work team. For more information, see <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * All of the <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     * <code>ClientId</code> and <code>UserPool</code> values.
     * </p>
     * 
     * @return A list of <code>MemberDefinition</code> objects that contains objects that identify the Amazon Cognito
     *         user pool that makes up the work team. For more information, see <a
     *         href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *         Cognito User Pools</a>.</p>
     *         <p>
     *         All of the <code>CognitoMemberDefinition</code> objects that make up the member definition must have the
     *         same <code>ClientId</code> and <code>UserPool</code> values.
     */

    public java.util.List<MemberDefinition> getMemberDefinitions() {
        return memberDefinitions;
    }

    /**
     * <p>
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the Amazon Cognito user pool
     * that makes up the work team. For more information, see <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * All of the <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     * <code>ClientId</code> and <code>UserPool</code> values.
     * </p>
     * 
     * @param memberDefinitions
     *        A list of <code>MemberDefinition</code> objects that contains objects that identify the Amazon Cognito
     *        user pool that makes up the work team. For more information, see <a
     *        href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *        Cognito User Pools</a>.</p>
     *        <p>
     *        All of the <code>CognitoMemberDefinition</code> objects that make up the member definition must have the
     *        same <code>ClientId</code> and <code>UserPool</code> values.
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
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the Amazon Cognito user pool
     * that makes up the work team. For more information, see <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * All of the <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     * <code>ClientId</code> and <code>UserPool</code> values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberDefinitions(java.util.Collection)} or {@link #withMemberDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param memberDefinitions
     *        A list of <code>MemberDefinition</code> objects that contains objects that identify the Amazon Cognito
     *        user pool that makes up the work team. For more information, see <a
     *        href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *        Cognito User Pools</a>.</p>
     *        <p>
     *        All of the <code>CognitoMemberDefinition</code> objects that make up the member definition must have the
     *        same <code>ClientId</code> and <code>UserPool</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withMemberDefinitions(MemberDefinition... memberDefinitions) {
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
     * A list of <code>MemberDefinition</code> objects that contains objects that identify the Amazon Cognito user pool
     * that makes up the work team. For more information, see <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * User Pools</a>.
     * </p>
     * <p>
     * All of the <code>CognitoMemberDefinition</code> objects that make up the member definition must have the same
     * <code>ClientId</code> and <code>UserPool</code> values.
     * </p>
     * 
     * @param memberDefinitions
     *        A list of <code>MemberDefinition</code> objects that contains objects that identify the Amazon Cognito
     *        user pool that makes up the work team. For more information, see <a
     *        href="http://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *        Cognito User Pools</a>.</p>
     *        <p>
     *        All of the <code>CognitoMemberDefinition</code> objects that make up the member definition must have the
     *        same <code>ClientId</code> and <code>UserPool</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withMemberDefinitions(java.util.Collection<MemberDefinition> memberDefinitions) {
        setMemberDefinitions(memberDefinitions);
        return this;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * 
     * @param description
     *        A description of the work team.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * 
     * @return A description of the work team.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the work team.
     * </p>
     * 
     * @param description
     *        A description of the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p/>
     * 
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkteamRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkteamRequest == false)
            return false;
        CreateWorkteamRequest other = (CreateWorkteamRequest) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkteamRequest clone() {
        return (CreateWorkteamRequest) super.clone();
    }

}
