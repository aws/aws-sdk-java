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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/GetAssociatedResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssociatedResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resource associated with the application.
     * </p>
     */
    private Resource resource;
    /**
     * <p>
     * Determines whether an application tag is applied or skipped.
     * </p>
     */
    private java.util.List<String> options;
    /**
     * <p>
     * The result of the application that's tag applied to a resource.
     * </p>
     */
    private ApplicationTagResult applicationTagResult;

    /**
     * <p>
     * The resource associated with the application.
     * </p>
     * 
     * @param resource
     *        The resource associated with the application.
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource associated with the application.
     * </p>
     * 
     * @return The resource associated with the application.
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource associated with the application.
     * </p>
     * 
     * @param resource
     *        The resource associated with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedResourceResult withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * Determines whether an application tag is applied or skipped.
     * </p>
     * 
     * @return Determines whether an application tag is applied or skipped.
     * @see AssociationOption
     */

    public java.util.List<String> getOptions() {
        return options;
    }

    /**
     * <p>
     * Determines whether an application tag is applied or skipped.
     * </p>
     * 
     * @param options
     *        Determines whether an application tag is applied or skipped.
     * @see AssociationOption
     */

    public void setOptions(java.util.Collection<String> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        this.options = new java.util.ArrayList<String>(options);
    }

    /**
     * <p>
     * Determines whether an application tag is applied or skipped.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptions(java.util.Collection)} or {@link #withOptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param options
     *        Determines whether an application tag is applied or skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationOption
     */

    public GetAssociatedResourceResult withOptions(String... options) {
        if (this.options == null) {
            setOptions(new java.util.ArrayList<String>(options.length));
        }
        for (String ele : options) {
            this.options.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Determines whether an application tag is applied or skipped.
     * </p>
     * 
     * @param options
     *        Determines whether an application tag is applied or skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationOption
     */

    public GetAssociatedResourceResult withOptions(java.util.Collection<String> options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * Determines whether an application tag is applied or skipped.
     * </p>
     * 
     * @param options
     *        Determines whether an application tag is applied or skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationOption
     */

    public GetAssociatedResourceResult withOptions(AssociationOption... options) {
        java.util.ArrayList<String> optionsCopy = new java.util.ArrayList<String>(options.length);
        for (AssociationOption value : options) {
            optionsCopy.add(value.toString());
        }
        if (getOptions() == null) {
            setOptions(optionsCopy);
        } else {
            getOptions().addAll(optionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The result of the application that's tag applied to a resource.
     * </p>
     * 
     * @param applicationTagResult
     *        The result of the application that's tag applied to a resource.
     */

    public void setApplicationTagResult(ApplicationTagResult applicationTagResult) {
        this.applicationTagResult = applicationTagResult;
    }

    /**
     * <p>
     * The result of the application that's tag applied to a resource.
     * </p>
     * 
     * @return The result of the application that's tag applied to a resource.
     */

    public ApplicationTagResult getApplicationTagResult() {
        return this.applicationTagResult;
    }

    /**
     * <p>
     * The result of the application that's tag applied to a resource.
     * </p>
     * 
     * @param applicationTagResult
     *        The result of the application that's tag applied to a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedResourceResult withApplicationTagResult(ApplicationTagResult applicationTagResult) {
        setApplicationTagResult(applicationTagResult);
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getApplicationTagResult() != null)
            sb.append("ApplicationTagResult: ").append(getApplicationTagResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssociatedResourceResult == false)
            return false;
        GetAssociatedResourceResult other = (GetAssociatedResourceResult) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getApplicationTagResult() == null ^ this.getApplicationTagResult() == null)
            return false;
        if (other.getApplicationTagResult() != null && other.getApplicationTagResult().equals(this.getApplicationTagResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getApplicationTagResult() == null) ? 0 : getApplicationTagResult().hashCode());
        return hashCode;
    }

    @Override
    public GetAssociatedResourceResult clone() {
        try {
            return (GetAssociatedResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
