/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about all the versions of a specific message template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/TemplateVersionsResponse" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateVersionsResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of responses, one for each version of the message template.
     * </p>
     */
    private java.util.List<TemplateVersionResponse> item;
    /**
     * <p>
     * The message that's returned from the API for the request to retrieve information about all the versions of the
     * message template.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The unique identifier for the request to retrieve information about all the versions of the message template.
     * </p>
     */
    private String requestID;

    /**
     * <p>
     * An array of responses, one for each version of the message template.
     * </p>
     * 
     * @return An array of responses, one for each version of the message template.
     */

    public java.util.List<TemplateVersionResponse> getItem() {
        return item;
    }

    /**
     * <p>
     * An array of responses, one for each version of the message template.
     * </p>
     * 
     * @param item
     *        An array of responses, one for each version of the message template.
     */

    public void setItem(java.util.Collection<TemplateVersionResponse> item) {
        if (item == null) {
            this.item = null;
            return;
        }

        this.item = new java.util.ArrayList<TemplateVersionResponse>(item);
    }

    /**
     * <p>
     * An array of responses, one for each version of the message template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItem(java.util.Collection)} or {@link #withItem(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param item
     *        An array of responses, one for each version of the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersionsResponse withItem(TemplateVersionResponse... item) {
        if (this.item == null) {
            setItem(new java.util.ArrayList<TemplateVersionResponse>(item.length));
        }
        for (TemplateVersionResponse ele : item) {
            this.item.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of responses, one for each version of the message template.
     * </p>
     * 
     * @param item
     *        An array of responses, one for each version of the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersionsResponse withItem(java.util.Collection<TemplateVersionResponse> item) {
        setItem(item);
        return this;
    }

    /**
     * <p>
     * The message that's returned from the API for the request to retrieve information about all the versions of the
     * message template.
     * </p>
     * 
     * @param message
     *        The message that's returned from the API for the request to retrieve information about all the versions of
     *        the message template.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message that's returned from the API for the request to retrieve information about all the versions of the
     * message template.
     * </p>
     * 
     * @return The message that's returned from the API for the request to retrieve information about all the versions
     *         of the message template.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message that's returned from the API for the request to retrieve information about all the versions of the
     * message template.
     * </p>
     * 
     * @param message
     *        The message that's returned from the API for the request to retrieve information about all the versions of
     *        the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersionsResponse withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @return The string to use in a subsequent request to get the next page of results in a paginated response. This
     *         value is null if there are no additional pages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null if there are no additional pages.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null if there are no additional pages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersionsResponse withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the request to retrieve information about all the versions of the message template.
     * </p>
     * 
     * @param requestID
     *        The unique identifier for the request to retrieve information about all the versions of the message
     *        template.
     */

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    /**
     * <p>
     * The unique identifier for the request to retrieve information about all the versions of the message template.
     * </p>
     * 
     * @return The unique identifier for the request to retrieve information about all the versions of the message
     *         template.
     */

    public String getRequestID() {
        return this.requestID;
    }

    /**
     * <p>
     * The unique identifier for the request to retrieve information about all the versions of the message template.
     * </p>
     * 
     * @param requestID
     *        The unique identifier for the request to retrieve information about all the versions of the message
     *        template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateVersionsResponse withRequestID(String requestID) {
        setRequestID(requestID);
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
        if (getItem() != null)
            sb.append("Item: ").append(getItem()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRequestID() != null)
            sb.append("RequestID: ").append(getRequestID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateVersionsResponse == false)
            return false;
        TemplateVersionsResponse other = (TemplateVersionsResponse) obj;
        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRequestID() == null ^ this.getRequestID() == null)
            return false;
        if (other.getRequestID() != null && other.getRequestID().equals(this.getRequestID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRequestID() == null) ? 0 : getRequestID().hashCode());
        return hashCode;
    }

    @Override
    public TemplateVersionsResponse clone() {
        try {
            return (TemplateVersionsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.TemplateVersionsResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
