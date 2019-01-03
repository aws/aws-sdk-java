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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents a usage plan key to identify a plan customer.
 * </p>
 * <div class="remarks">
 * <p>
 * To associate an API stage with a selected API key in a usage plan, you must create a UsagePlanKey resource to
 * represent the selected <a>ApiKey</a>.
 * </p>
 * </div>" <div class="seeAlso"> <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-
 * usage-plans.html">Create and Use Usage Plans</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUsagePlanKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Id of a usage plan key.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of a usage plan key. Currently, the valid key type is <code>API_KEY</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The value of a usage plan key.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The name of a usage plan key.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Id of a usage plan key.
     * </p>
     * 
     * @param id
     *        The Id of a usage plan key.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The Id of a usage plan key.
     * </p>
     * 
     * @return The Id of a usage plan key.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The Id of a usage plan key.
     * </p>
     * 
     * @param id
     *        The Id of a usage plan key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsagePlanKeyResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of a usage plan key. Currently, the valid key type is <code>API_KEY</code>.
     * </p>
     * 
     * @param type
     *        The type of a usage plan key. Currently, the valid key type is <code>API_KEY</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of a usage plan key. Currently, the valid key type is <code>API_KEY</code>.
     * </p>
     * 
     * @return The type of a usage plan key. Currently, the valid key type is <code>API_KEY</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of a usage plan key. Currently, the valid key type is <code>API_KEY</code>.
     * </p>
     * 
     * @param type
     *        The type of a usage plan key. Currently, the valid key type is <code>API_KEY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsagePlanKeyResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The value of a usage plan key.
     * </p>
     * 
     * @param value
     *        The value of a usage plan key.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of a usage plan key.
     * </p>
     * 
     * @return The value of a usage plan key.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of a usage plan key.
     * </p>
     * 
     * @param value
     *        The value of a usage plan key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsagePlanKeyResult withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The name of a usage plan key.
     * </p>
     * 
     * @param name
     *        The name of a usage plan key.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a usage plan key.
     * </p>
     * 
     * @return The name of a usage plan key.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a usage plan key.
     * </p>
     * 
     * @param name
     *        The name of a usage plan key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUsagePlanKeyResult withName(String name) {
        setName(name);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUsagePlanKeyResult == false)
            return false;
        GetUsagePlanKeyResult other = (GetUsagePlanKeyResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public GetUsagePlanKeyResult clone() {
        try {
            return (GetUsagePlanKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
