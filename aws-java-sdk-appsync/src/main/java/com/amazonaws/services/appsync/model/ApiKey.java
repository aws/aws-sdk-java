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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an API key.
 * </p>
 * <p>
 * Customers invoke AWS AppSync GraphQL API operations with API keys as an identity mechanism. There are two key
 * versions:
 * </p>
 * <p>
 * <b>da1</b>: This version was introduced at launch in November 2017. These keys always expire after 7 days. Key
 * expiration is managed by Amazon DynamoDB TTL. The keys ceased to be valid after February 21, 2018 and should not be
 * used after that date.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ListApiKeys</code> returns the expiration time in milliseconds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateApiKey</code> returns the expiration time in milliseconds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateApiKey</code> is not available for this key version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteApiKey</code> deletes the item from the table.
 * </p>
 * </li>
 * <li>
 * <p>
 * Expiration is stored in Amazon DynamoDB as milliseconds. This results in a bug where keys are not automatically
 * deleted because DynamoDB expects the TTL to be stored in seconds. As a one-time action, we will delete these keys
 * from the table after February 21, 2018.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>da2</b>: This version was introduced in February 2018 when AppSync added support to extend key expiration.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>ListApiKeys</code> returns the expiration time in seconds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateApiKey</code> returns the expiration time in seconds and accepts a user-provided expiration time in
 * seconds.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateApiKey</code> returns the expiration time in seconds and accepts a user-provided expiration time in
 * seconds. Key expiration can only be updated while the key has not expired.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteApiKey</code> deletes the item from the table.
 * </p>
 * </li>
 * <li>
 * <p>
 * Expiration is stored in Amazon DynamoDB as seconds.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/ApiKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The API key ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A description of the purpose of the API key.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the
     * nearest hour.
     * </p>
     */
    private Long expires;

    /**
     * <p>
     * The API key ID.
     * </p>
     * 
     * @param id
     *        The API key ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The API key ID.
     * </p>
     * 
     * @return The API key ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The API key ID.
     * </p>
     * 
     * @param id
     *        The API key ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKey withId(String id) {
        setId(id);
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

    public ApiKey withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the
     * nearest hour.
     * </p>
     * 
     * @param expires
     *        The time after which the API key expires. The date is represented as seconds since the epoch, rounded down
     *        to the nearest hour.
     */

    public void setExpires(Long expires) {
        this.expires = expires;
    }

    /**
     * <p>
     * The time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the
     * nearest hour.
     * </p>
     * 
     * @return The time after which the API key expires. The date is represented as seconds since the epoch, rounded
     *         down to the nearest hour.
     */

    public Long getExpires() {
        return this.expires;
    }

    /**
     * <p>
     * The time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the
     * nearest hour.
     * </p>
     * 
     * @param expires
     *        The time after which the API key expires. The date is represented as seconds since the epoch, rounded down
     *        to the nearest hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKey withExpires(Long expires) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof ApiKey == false)
            return false;
        ApiKey other = (ApiKey) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExpires() == null) ? 0 : getExpires().hashCode());
        return hashCode;
    }

    @Override
    public ApiKey clone() {
        try {
            return (ApiKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.ApiKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
