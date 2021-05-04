/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for FinSpace environment that you created.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the FinSpace environment that you created.
     * </p>
     */
    private String environmentArn;
    /**
     * <p>
     * The sign-in url for the web application of the FinSpace environment you created.
     * </p>
     */
    private String environmentUrl;

    /**
     * <p>
     * The unique identifier for FinSpace environment that you created.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier for FinSpace environment that you created.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The unique identifier for FinSpace environment that you created.
     * </p>
     * 
     * @return The unique identifier for FinSpace environment that you created.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The unique identifier for FinSpace environment that you created.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier for FinSpace environment that you created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the FinSpace environment that you created.
     * </p>
     * 
     * @param environmentArn
     *        The Amazon Resource Name (ARN) of the FinSpace environment that you created.
     */

    public void setEnvironmentArn(String environmentArn) {
        this.environmentArn = environmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the FinSpace environment that you created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the FinSpace environment that you created.
     */

    public String getEnvironmentArn() {
        return this.environmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the FinSpace environment that you created.
     * </p>
     * 
     * @param environmentArn
     *        The Amazon Resource Name (ARN) of the FinSpace environment that you created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentResult withEnvironmentArn(String environmentArn) {
        setEnvironmentArn(environmentArn);
        return this;
    }

    /**
     * <p>
     * The sign-in url for the web application of the FinSpace environment you created.
     * </p>
     * 
     * @param environmentUrl
     *        The sign-in url for the web application of the FinSpace environment you created.
     */

    public void setEnvironmentUrl(String environmentUrl) {
        this.environmentUrl = environmentUrl;
    }

    /**
     * <p>
     * The sign-in url for the web application of the FinSpace environment you created.
     * </p>
     * 
     * @return The sign-in url for the web application of the FinSpace environment you created.
     */

    public String getEnvironmentUrl() {
        return this.environmentUrl;
    }

    /**
     * <p>
     * The sign-in url for the web application of the FinSpace environment you created.
     * </p>
     * 
     * @param environmentUrl
     *        The sign-in url for the web application of the FinSpace environment you created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentResult withEnvironmentUrl(String environmentUrl) {
        setEnvironmentUrl(environmentUrl);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getEnvironmentArn() != null)
            sb.append("EnvironmentArn: ").append(getEnvironmentArn()).append(",");
        if (getEnvironmentUrl() != null)
            sb.append("EnvironmentUrl: ").append(getEnvironmentUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEnvironmentResult == false)
            return false;
        CreateEnvironmentResult other = (CreateEnvironmentResult) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getEnvironmentArn() == null ^ this.getEnvironmentArn() == null)
            return false;
        if (other.getEnvironmentArn() != null && other.getEnvironmentArn().equals(this.getEnvironmentArn()) == false)
            return false;
        if (other.getEnvironmentUrl() == null ^ this.getEnvironmentUrl() == null)
            return false;
        if (other.getEnvironmentUrl() != null && other.getEnvironmentUrl().equals(this.getEnvironmentUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentArn() == null) ? 0 : getEnvironmentArn().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentUrl() == null) ? 0 : getEnvironmentUrl().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentResult clone() {
        try {
            return (CreateEnvironmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
