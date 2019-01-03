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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateSkillGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSkillGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the skill group.
     * </p>
     */
    private String skillGroupName;
    /**
     * <p>
     * The description for the skill group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name for the skill group.
     * </p>
     * 
     * @param skillGroupName
     *        The name for the skill group.
     */

    public void setSkillGroupName(String skillGroupName) {
        this.skillGroupName = skillGroupName;
    }

    /**
     * <p>
     * The name for the skill group.
     * </p>
     * 
     * @return The name for the skill group.
     */

    public String getSkillGroupName() {
        return this.skillGroupName;
    }

    /**
     * <p>
     * The name for the skill group.
     * </p>
     * 
     * @param skillGroupName
     *        The name for the skill group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSkillGroupRequest withSkillGroupName(String skillGroupName) {
        setSkillGroupName(skillGroupName);
        return this;
    }

    /**
     * <p>
     * The description for the skill group.
     * </p>
     * 
     * @param description
     *        The description for the skill group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the skill group.
     * </p>
     * 
     * @return The description for the skill group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the skill group.
     * </p>
     * 
     * @param description
     *        The description for the skill group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSkillGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, user-specified identifier for this request that ensures idempotency.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @return A unique, user-specified identifier for this request that ensures idempotency.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for this request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, user-specified identifier for this request that ensures idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSkillGroupRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getSkillGroupName() != null)
            sb.append("SkillGroupName: ").append(getSkillGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSkillGroupRequest == false)
            return false;
        CreateSkillGroupRequest other = (CreateSkillGroupRequest) obj;
        if (other.getSkillGroupName() == null ^ this.getSkillGroupName() == null)
            return false;
        if (other.getSkillGroupName() != null && other.getSkillGroupName().equals(this.getSkillGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkillGroupName() == null) ? 0 : getSkillGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateSkillGroupRequest clone() {
        return (CreateSkillGroupRequest) super.clone();
    }

}
