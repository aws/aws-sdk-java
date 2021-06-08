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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPointForObjectLambda"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccessPointForObjectLambdaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS account ID for owner of the specified Object Lambda Access Point.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name you want to assign to this Object Lambda Access Point.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Object Lambda Access Point configuration as a JSON document.
     * </p>
     */
    private ObjectLambdaConfiguration configuration;

    /**
     * <p>
     * The AWS account ID for owner of the specified Object Lambda Access Point.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID for owner of the specified Object Lambda Access Point.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID for owner of the specified Object Lambda Access Point.
     * </p>
     * 
     * @return The AWS account ID for owner of the specified Object Lambda Access Point.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID for owner of the specified Object Lambda Access Point.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID for owner of the specified Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointForObjectLambdaRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name you want to assign to this Object Lambda Access Point.
     * </p>
     * 
     * @param name
     *        The name you want to assign to this Object Lambda Access Point.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name you want to assign to this Object Lambda Access Point.
     * </p>
     * 
     * @return The name you want to assign to this Object Lambda Access Point.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name you want to assign to this Object Lambda Access Point.
     * </p>
     * 
     * @param name
     *        The name you want to assign to this Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointForObjectLambdaRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Object Lambda Access Point configuration as a JSON document.
     * </p>
     * 
     * @param configuration
     *        Object Lambda Access Point configuration as a JSON document.
     */

    public void setConfiguration(ObjectLambdaConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Object Lambda Access Point configuration as a JSON document.
     * </p>
     * 
     * @return Object Lambda Access Point configuration as a JSON document.
     */

    public ObjectLambdaConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Object Lambda Access Point configuration as a JSON document.
     * </p>
     * 
     * @param configuration
     *        Object Lambda Access Point configuration as a JSON document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccessPointForObjectLambdaRequest withConfiguration(ObjectLambdaConfiguration configuration) {
        setConfiguration(configuration);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccessPointForObjectLambdaRequest == false)
            return false;
        CreateAccessPointForObjectLambdaRequest other = (CreateAccessPointForObjectLambdaRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccessPointForObjectLambdaRequest clone() {
        return (CreateAccessPointForObjectLambdaRequest) super.clone();
    }

}
