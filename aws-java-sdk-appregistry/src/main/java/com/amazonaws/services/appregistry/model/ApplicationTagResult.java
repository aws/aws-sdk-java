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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of the application tag that's applied to a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/ApplicationTagResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationTagResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application tag is in the process of being applied to a resource, was successfully applied to a resource, or
     * failed to apply to a resource.
     * </p>
     */
    private String applicationTagStatus;
    /**
     * <p>
     * The message returned if the call fails.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The resources associated with an application
     * </p>
     */
    private java.util.List<ResourcesListItem> resources;
    /**
     * <p>
     * A unique pagination token for each page of results. Make the call again with the returned token to retrieve the
     * next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The application tag is in the process of being applied to a resource, was successfully applied to a resource, or
     * failed to apply to a resource.
     * </p>
     * 
     * @param applicationTagStatus
     *        The application tag is in the process of being applied to a resource, was successfully applied to a
     *        resource, or failed to apply to a resource.
     * @see ApplicationTagStatus
     */

    public void setApplicationTagStatus(String applicationTagStatus) {
        this.applicationTagStatus = applicationTagStatus;
    }

    /**
     * <p>
     * The application tag is in the process of being applied to a resource, was successfully applied to a resource, or
     * failed to apply to a resource.
     * </p>
     * 
     * @return The application tag is in the process of being applied to a resource, was successfully applied to a
     *         resource, or failed to apply to a resource.
     * @see ApplicationTagStatus
     */

    public String getApplicationTagStatus() {
        return this.applicationTagStatus;
    }

    /**
     * <p>
     * The application tag is in the process of being applied to a resource, was successfully applied to a resource, or
     * failed to apply to a resource.
     * </p>
     * 
     * @param applicationTagStatus
     *        The application tag is in the process of being applied to a resource, was successfully applied to a
     *        resource, or failed to apply to a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationTagStatus
     */

    public ApplicationTagResult withApplicationTagStatus(String applicationTagStatus) {
        setApplicationTagStatus(applicationTagStatus);
        return this;
    }

    /**
     * <p>
     * The application tag is in the process of being applied to a resource, was successfully applied to a resource, or
     * failed to apply to a resource.
     * </p>
     * 
     * @param applicationTagStatus
     *        The application tag is in the process of being applied to a resource, was successfully applied to a
     *        resource, or failed to apply to a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationTagStatus
     */

    public ApplicationTagResult withApplicationTagStatus(ApplicationTagStatus applicationTagStatus) {
        this.applicationTagStatus = applicationTagStatus.toString();
        return this;
    }

    /**
     * <p>
     * The message returned if the call fails.
     * </p>
     * 
     * @param errorMessage
     *        The message returned if the call fails.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The message returned if the call fails.
     * </p>
     * 
     * @return The message returned if the call fails.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The message returned if the call fails.
     * </p>
     * 
     * @param errorMessage
     *        The message returned if the call fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationTagResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The resources associated with an application
     * </p>
     * 
     * @return The resources associated with an application
     */

    public java.util.List<ResourcesListItem> getResources() {
        return resources;
    }

    /**
     * <p>
     * The resources associated with an application
     * </p>
     * 
     * @param resources
     *        The resources associated with an application
     */

    public void setResources(java.util.Collection<ResourcesListItem> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<ResourcesListItem>(resources);
    }

    /**
     * <p>
     * The resources associated with an application
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The resources associated with an application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationTagResult withResources(ResourcesListItem... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<ResourcesListItem>(resources.length));
        }
        for (ResourcesListItem ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources associated with an application
     * </p>
     * 
     * @param resources
     *        The resources associated with an application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationTagResult withResources(java.util.Collection<ResourcesListItem> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * A unique pagination token for each page of results. Make the call again with the returned token to retrieve the
     * next page of results.
     * </p>
     * 
     * @param nextToken
     *        A unique pagination token for each page of results. Make the call again with the returned token to
     *        retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A unique pagination token for each page of results. Make the call again with the returned token to retrieve the
     * next page of results.
     * </p>
     * 
     * @return A unique pagination token for each page of results. Make the call again with the returned token to
     *         retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A unique pagination token for each page of results. Make the call again with the returned token to retrieve the
     * next page of results.
     * </p>
     * 
     * @param nextToken
     *        A unique pagination token for each page of results. Make the call again with the returned token to
     *        retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationTagResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getApplicationTagStatus() != null)
            sb.append("ApplicationTagStatus: ").append(getApplicationTagStatus()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationTagResult == false)
            return false;
        ApplicationTagResult other = (ApplicationTagResult) obj;
        if (other.getApplicationTagStatus() == null ^ this.getApplicationTagStatus() == null)
            return false;
        if (other.getApplicationTagStatus() != null && other.getApplicationTagStatus().equals(this.getApplicationTagStatus()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationTagStatus() == null) ? 0 : getApplicationTagStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationTagResult clone() {
        try {
            return (ApplicationTagResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appregistry.model.transform.ApplicationTagResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
