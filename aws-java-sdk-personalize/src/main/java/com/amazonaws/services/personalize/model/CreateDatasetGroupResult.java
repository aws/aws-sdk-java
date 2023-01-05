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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new dataset group.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * The domain for the new Domain dataset group.
     * </p>
     */
    private String domain;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new dataset group.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the new dataset group.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new dataset group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the new dataset group.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new dataset group.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the new dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetGroupResult withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * The domain for the new Domain dataset group.
     * </p>
     * 
     * @param domain
     *        The domain for the new Domain dataset group.
     * @see Domain
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain for the new Domain dataset group.
     * </p>
     * 
     * @return The domain for the new Domain dataset group.
     * @see Domain
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain for the new Domain dataset group.
     * </p>
     * 
     * @param domain
     *        The domain for the new Domain dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public CreateDatasetGroupResult withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The domain for the new Domain dataset group.
     * </p>
     * 
     * @param domain
     *        The domain for the new Domain dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public CreateDatasetGroupResult withDomain(Domain domain) {
        this.domain = domain.toString();
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
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetGroupResult == false)
            return false;
        CreateDatasetGroupResult other = (CreateDatasetGroupResult) obj;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetGroupResult clone() {
        try {
            return (CreateDatasetGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
