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
package com.amazonaws.services.iotfleethub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleethub-2020-11-03/CreateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique Id of the web application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ARN of the web application.
     * </p>
     */
    private String applicationArn;

    /**
     * <p>
     * The unique Id of the web application.
     * </p>
     * 
     * @param applicationId
     *        The unique Id of the web application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique Id of the web application.
     * </p>
     * 
     * @return The unique Id of the web application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique Id of the web application.
     * </p>
     * 
     * @param applicationId
     *        The unique Id of the web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ARN of the web application.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the web application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The ARN of the web application.
     * </p>
     * 
     * @return The ARN of the web application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The ARN of the web application.
     * </p>
     * 
     * @param applicationArn
     *        The ARN of the web application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationResult == false)
            return false;
        CreateApplicationResult other = (CreateApplicationResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationResult clone() {
        try {
            return (CreateApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
