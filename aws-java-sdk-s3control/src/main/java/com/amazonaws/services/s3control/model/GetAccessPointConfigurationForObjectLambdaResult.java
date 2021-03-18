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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointConfigurationForObjectLambda"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessPointConfigurationForObjectLambdaResult extends
        com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Object Lambda Access Point configuration document.
     * </p>
     */
    private ObjectLambdaConfiguration configuration;

    /**
     * <p>
     * Object Lambda Access Point configuration document.
     * </p>
     * 
     * @param configuration
     *        Object Lambda Access Point configuration document.
     */

    public void setConfiguration(ObjectLambdaConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Object Lambda Access Point configuration document.
     * </p>
     * 
     * @return Object Lambda Access Point configuration document.
     */

    public ObjectLambdaConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Object Lambda Access Point configuration document.
     * </p>
     * 
     * @param configuration
     *        Object Lambda Access Point configuration document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccessPointConfigurationForObjectLambdaResult withConfiguration(ObjectLambdaConfiguration configuration) {
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

        if (obj instanceof GetAccessPointConfigurationForObjectLambdaResult == false)
            return false;
        GetAccessPointConfigurationForObjectLambdaResult other = (GetAccessPointConfigurationForObjectLambdaResult) obj;
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

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessPointConfigurationForObjectLambdaResult clone() {
        try {
            return (GetAccessPointConfigurationForObjectLambdaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
