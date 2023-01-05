/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/CreateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The unique application identifier.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The version number of the application.
     * </p>
     */
    private Integer applicationVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The unique application identifier.
     * </p>
     * 
     * @param applicationId
     *        The unique application identifier.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique application identifier.
     * </p>
     * 
     * @return The unique application identifier.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique application identifier.
     * </p>
     * 
     * @param applicationId
     *        The unique application identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The version number of the application.
     * </p>
     * 
     * @param applicationVersion
     *        The version number of the application.
     */

    public void setApplicationVersion(Integer applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    /**
     * <p>
     * The version number of the application.
     * </p>
     * 
     * @return The version number of the application.
     */

    public Integer getApplicationVersion() {
        return this.applicationVersion;
    }

    /**
     * <p>
     * The version number of the application.
     * </p>
     * 
     * @param applicationVersion
     *        The version number of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withApplicationVersion(Integer applicationVersion) {
        setApplicationVersion(applicationVersion);
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
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getApplicationVersion() != null)
            sb.append("ApplicationVersion: ").append(getApplicationVersion());
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
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getApplicationVersion() == null ^ this.getApplicationVersion() == null)
            return false;
        if (other.getApplicationVersion() != null && other.getApplicationVersion().equals(this.getApplicationVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersion() == null) ? 0 : getApplicationVersion().hashCode());
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
