/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/CreateMLEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMLEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the new inference endpoint.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN for the new inference endpoint.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The endpoint creation time, in milliseconds.
     * </p>
     */
    private Long creationTimeInMillis;

    /**
     * <p>
     * The unique ID of the new inference endpoint.
     * </p>
     * 
     * @param id
     *        The unique ID of the new inference endpoint.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the new inference endpoint.
     * </p>
     * 
     * @return The unique ID of the new inference endpoint.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the new inference endpoint.
     * </p>
     * 
     * @param id
     *        The unique ID of the new inference endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMLEndpointResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN for the new inference endpoint.
     * </p>
     * 
     * @param arn
     *        The ARN for the new inference endpoint.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the new inference endpoint.
     * </p>
     * 
     * @return The ARN for the new inference endpoint.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN for the new inference endpoint.
     * </p>
     * 
     * @param arn
     *        The ARN for the new inference endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMLEndpointResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The endpoint creation time, in milliseconds.
     * </p>
     * 
     * @param creationTimeInMillis
     *        The endpoint creation time, in milliseconds.
     */

    public void setCreationTimeInMillis(Long creationTimeInMillis) {
        this.creationTimeInMillis = creationTimeInMillis;
    }

    /**
     * <p>
     * The endpoint creation time, in milliseconds.
     * </p>
     * 
     * @return The endpoint creation time, in milliseconds.
     */

    public Long getCreationTimeInMillis() {
        return this.creationTimeInMillis;
    }

    /**
     * <p>
     * The endpoint creation time, in milliseconds.
     * </p>
     * 
     * @param creationTimeInMillis
     *        The endpoint creation time, in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMLEndpointResult withCreationTimeInMillis(Long creationTimeInMillis) {
        setCreationTimeInMillis(creationTimeInMillis);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTimeInMillis() != null)
            sb.append("CreationTimeInMillis: ").append(getCreationTimeInMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMLEndpointResult == false)
            return false;
        CreateMLEndpointResult other = (CreateMLEndpointResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTimeInMillis() == null ^ this.getCreationTimeInMillis() == null)
            return false;
        if (other.getCreationTimeInMillis() != null && other.getCreationTimeInMillis().equals(this.getCreationTimeInMillis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeInMillis() == null) ? 0 : getCreationTimeInMillis().hashCode());
        return hashCode;
    }

    @Override
    public CreateMLEndpointResult clone() {
        try {
            return (CreateMLEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
