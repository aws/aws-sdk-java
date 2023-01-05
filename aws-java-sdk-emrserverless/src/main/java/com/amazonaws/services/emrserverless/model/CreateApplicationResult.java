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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/CreateApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The output contains the application ID.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The output contains the name of the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The output contains the ARN of the application.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The output contains the application ID.
     * </p>
     * 
     * @param applicationId
     *        The output contains the application ID.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The output contains the application ID.
     * </p>
     * 
     * @return The output contains the application ID.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The output contains the application ID.
     * </p>
     * 
     * @param applicationId
     *        The output contains the application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The output contains the name of the application.
     * </p>
     * 
     * @param name
     *        The output contains the name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The output contains the name of the application.
     * </p>
     * 
     * @return The output contains the name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The output contains the name of the application.
     * </p>
     * 
     * @param name
     *        The output contains the name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The output contains the ARN of the application.
     * </p>
     * 
     * @param arn
     *        The output contains the ARN of the application.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The output contains the ARN of the application.
     * </p>
     * 
     * @return The output contains the ARN of the application.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The output contains the ARN of the application.
     * </p>
     * 
     * @param arn
     *        The output contains the ARN of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withArn(String arn) {
        setArn(arn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
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
