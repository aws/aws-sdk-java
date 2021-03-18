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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointForObjectLambda"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessPointForObjectLambdaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Object Lambda Access Point.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Configuration to block all public access. This setting is turned on and can not be edited.
     * </p>
     */
    private PublicAccessBlockConfiguration publicAccessBlockConfiguration;
    /**
     * <p>
     * The date and time when the specified Object Lambda Access Point was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The name of the Object Lambda Access Point.
     * </p>
     * 
     * @param name
     *        The name of the Object Lambda Access Point.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Object Lambda Access Point.
     * </p>
     * 
     * @return The name of the Object Lambda Access Point.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Object Lambda Access Point.
     * </p>
     * 
     * @param name
     *        The name of the Object Lambda Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPointForObjectLambdaResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Configuration to block all public access. This setting is turned on and can not be edited.
     * </p>
     * 
     * @param publicAccessBlockConfiguration
     *        Configuration to block all public access. This setting is turned on and can not be edited.
     */

    public void setPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
    }

    /**
     * <p>
     * Configuration to block all public access. This setting is turned on and can not be edited.
     * </p>
     * 
     * @return Configuration to block all public access. This setting is turned on and can not be edited.
     */

    public PublicAccessBlockConfiguration getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration;
    }

    /**
     * <p>
     * Configuration to block all public access. This setting is turned on and can not be edited.
     * </p>
     * 
     * @param publicAccessBlockConfiguration
     *        Configuration to block all public access. This setting is turned on and can not be edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPointForObjectLambdaResult withPublicAccessBlockConfiguration(PublicAccessBlockConfiguration publicAccessBlockConfiguration) {
        setPublicAccessBlockConfiguration(publicAccessBlockConfiguration);
        return this;
    }

    /**
     * <p>
     * The date and time when the specified Object Lambda Access Point was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the specified Object Lambda Access Point was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the specified Object Lambda Access Point was created.
     * </p>
     * 
     * @return The date and time when the specified Object Lambda Access Point was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time when the specified Object Lambda Access Point was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the specified Object Lambda Access Point was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPointForObjectLambdaResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getPublicAccessBlockConfiguration() != null)
            sb.append("PublicAccessBlockConfiguration: ").append(getPublicAccessBlockConfiguration()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessPointForObjectLambdaResult == false)
            return false;
        GetAccessPointForObjectLambdaResult other = (GetAccessPointForObjectLambdaResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPublicAccessBlockConfiguration() == null ^ this.getPublicAccessBlockConfiguration() == null)
            return false;
        if (other.getPublicAccessBlockConfiguration() != null
                && other.getPublicAccessBlockConfiguration().equals(this.getPublicAccessBlockConfiguration()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessBlockConfiguration() == null) ? 0 : getPublicAccessBlockConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessPointForObjectLambdaResult clone() {
        try {
            return (GetAccessPointForObjectLambdaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
