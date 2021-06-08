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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/UpdateParallelData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateParallelDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the parallel data resource being updated.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A custom description for the parallel data resource in Amazon Translate.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     */
    private ParallelDataConfig parallelDataConfig;
    /**
     * <p>
     * A unique identifier for the request. This token is automatically generated when you use Amazon Translate through
     * an AWS SDK.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the parallel data resource being updated.
     * </p>
     * 
     * @param name
     *        The name of the parallel data resource being updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parallel data resource being updated.
     * </p>
     * 
     * @return The name of the parallel data resource being updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parallel data resource being updated.
     * </p>
     * 
     * @param name
     *        The name of the parallel data resource being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParallelDataRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A custom description for the parallel data resource in Amazon Translate.
     * </p>
     * 
     * @param description
     *        A custom description for the parallel data resource in Amazon Translate.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description for the parallel data resource in Amazon Translate.
     * </p>
     * 
     * @return A custom description for the parallel data resource in Amazon Translate.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A custom description for the parallel data resource in Amazon Translate.
     * </p>
     * 
     * @param description
     *        A custom description for the parallel data resource in Amazon Translate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParallelDataRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     * 
     * @param parallelDataConfig
     *        Specifies the format and S3 location of the parallel data input file.
     */

    public void setParallelDataConfig(ParallelDataConfig parallelDataConfig) {
        this.parallelDataConfig = parallelDataConfig;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     * 
     * @return Specifies the format and S3 location of the parallel data input file.
     */

    public ParallelDataConfig getParallelDataConfig() {
        return this.parallelDataConfig;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     * 
     * @param parallelDataConfig
     *        Specifies the format and S3 location of the parallel data input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParallelDataRequest withParallelDataConfig(ParallelDataConfig parallelDataConfig) {
        setParallelDataConfig(parallelDataConfig);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the request. This token is automatically generated when you use Amazon Translate through
     * an AWS SDK.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for the request. This token is automatically generated when you use Amazon Translate
     *        through an AWS SDK.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. This token is automatically generated when you use Amazon Translate through
     * an AWS SDK.
     * </p>
     * 
     * @return A unique identifier for the request. This token is automatically generated when you use Amazon Translate
     *         through an AWS SDK.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier for the request. This token is automatically generated when you use Amazon Translate through
     * an AWS SDK.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for the request. This token is automatically generated when you use Amazon Translate
     *        through an AWS SDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateParallelDataRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParallelDataConfig() != null)
            sb.append("ParallelDataConfig: ").append(getParallelDataConfig()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateParallelDataRequest == false)
            return false;
        UpdateParallelDataRequest other = (UpdateParallelDataRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParallelDataConfig() == null ^ this.getParallelDataConfig() == null)
            return false;
        if (other.getParallelDataConfig() != null && other.getParallelDataConfig().equals(this.getParallelDataConfig()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParallelDataConfig() == null) ? 0 : getParallelDataConfig().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateParallelDataRequest clone() {
        return (UpdateParallelDataRequest) super.clone();
    }

}
