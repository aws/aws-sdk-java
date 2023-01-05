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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/BatchGetRepositoryScanningConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetRepositoryScanningConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more repository names to get the scanning configuration for.
     * </p>
     */
    private java.util.List<String> repositoryNames;

    /**
     * <p>
     * One or more repository names to get the scanning configuration for.
     * </p>
     * 
     * @return One or more repository names to get the scanning configuration for.
     */

    public java.util.List<String> getRepositoryNames() {
        return repositoryNames;
    }

    /**
     * <p>
     * One or more repository names to get the scanning configuration for.
     * </p>
     * 
     * @param repositoryNames
     *        One or more repository names to get the scanning configuration for.
     */

    public void setRepositoryNames(java.util.Collection<String> repositoryNames) {
        if (repositoryNames == null) {
            this.repositoryNames = null;
            return;
        }

        this.repositoryNames = new java.util.ArrayList<String>(repositoryNames);
    }

    /**
     * <p>
     * One or more repository names to get the scanning configuration for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositoryNames(java.util.Collection)} or {@link #withRepositoryNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param repositoryNames
     *        One or more repository names to get the scanning configuration for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRepositoryScanningConfigurationRequest withRepositoryNames(String... repositoryNames) {
        if (this.repositoryNames == null) {
            setRepositoryNames(new java.util.ArrayList<String>(repositoryNames.length));
        }
        for (String ele : repositoryNames) {
            this.repositoryNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more repository names to get the scanning configuration for.
     * </p>
     * 
     * @param repositoryNames
     *        One or more repository names to get the scanning configuration for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRepositoryScanningConfigurationRequest withRepositoryNames(java.util.Collection<String> repositoryNames) {
        setRepositoryNames(repositoryNames);
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
        if (getRepositoryNames() != null)
            sb.append("RepositoryNames: ").append(getRepositoryNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetRepositoryScanningConfigurationRequest == false)
            return false;
        BatchGetRepositoryScanningConfigurationRequest other = (BatchGetRepositoryScanningConfigurationRequest) obj;
        if (other.getRepositoryNames() == null ^ this.getRepositoryNames() == null)
            return false;
        if (other.getRepositoryNames() != null && other.getRepositoryNames().equals(this.getRepositoryNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryNames() == null) ? 0 : getRepositoryNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetRepositoryScanningConfigurationRequest clone() {
        return (BatchGetRepositoryScanningConfigurationRequest) super.clone();
    }

}
