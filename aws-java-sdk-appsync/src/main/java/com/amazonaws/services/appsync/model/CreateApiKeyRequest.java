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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateApiKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApiKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for your GraphQL API.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * A description of the purpose of the API key.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time from creation time after which the API key expires. The date is represented as seconds since the epoch,
     * rounded down to the nearest hour. The default value for this parameter is 7 days from creation time. For more
     * information, see .
     * </p>
     */
    private Long expires;

    /**
     * <p>
     * The ID for your GraphQL API.
     * </p>
     * 
     * @param apiId
     *        The ID for your GraphQL API.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The ID for your GraphQL API.
     * </p>
     * 
     * @return The ID for your GraphQL API.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The ID for your GraphQL API.
     * </p>
     * 
     * @param apiId
     *        The ID for your GraphQL API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiKeyRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * A description of the purpose of the API key.
     * </p>
     * 
     * @param description
     *        A description of the purpose of the API key.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the purpose of the API key.
     * </p>
     * 
     * @return A description of the purpose of the API key.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the purpose of the API key.
     * </p>
     * 
     * @param description
     *        A description of the purpose of the API key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiKeyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time from creation time after which the API key expires. The date is represented as seconds since the epoch,
     * rounded down to the nearest hour. The default value for this parameter is 7 days from creation time. For more
     * information, see .
     * </p>
     * 
     * @param expires
     *        The time from creation time after which the API key expires. The date is represented as seconds since the
     *        epoch, rounded down to the nearest hour. The default value for this parameter is 7 days from creation
     *        time. For more information, see .
     */

    public void setExpires(Long expires) {
        this.expires = expires;
    }

    /**
     * <p>
     * The time from creation time after which the API key expires. The date is represented as seconds since the epoch,
     * rounded down to the nearest hour. The default value for this parameter is 7 days from creation time. For more
     * information, see .
     * </p>
     * 
     * @return The time from creation time after which the API key expires. The date is represented as seconds since the
     *         epoch, rounded down to the nearest hour. The default value for this parameter is 7 days from creation
     *         time. For more information, see .
     */

    public Long getExpires() {
        return this.expires;
    }

    /**
     * <p>
     * The time from creation time after which the API key expires. The date is represented as seconds since the epoch,
     * rounded down to the nearest hour. The default value for this parameter is 7 days from creation time. For more
     * information, see .
     * </p>
     * 
     * @param expires
     *        The time from creation time after which the API key expires. The date is represented as seconds since the
     *        epoch, rounded down to the nearest hour. The default value for this parameter is 7 days from creation
     *        time. For more information, see .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiKeyRequest withExpires(Long expires) {
        setExpires(expires);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExpires() != null)
            sb.append("Expires: ").append(getExpires());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApiKeyRequest == false)
            return false;
        CreateApiKeyRequest other = (CreateApiKeyRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExpires() == null ^ this.getExpires() == null)
            return false;
        if (other.getExpires() != null && other.getExpires().equals(this.getExpires()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExpires() == null) ? 0 : getExpires().hashCode());
        return hashCode;
    }

    @Override
    public CreateApiKeyRequest clone() {
        return (CreateApiKeyRequest) super.clone();
    }

}
