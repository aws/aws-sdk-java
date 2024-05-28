/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateAwsLogSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAwsLogSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the natively-supported Amazon Web Services service to add as a source in Security Lake.
     * </p>
     */
    private java.util.List<AwsLogSourceConfiguration> sources;

    /**
     * <p>
     * Specify the natively-supported Amazon Web Services service to add as a source in Security Lake.
     * </p>
     * 
     * @return Specify the natively-supported Amazon Web Services service to add as a source in Security Lake.
     */

    public java.util.List<AwsLogSourceConfiguration> getSources() {
        return sources;
    }

    /**
     * <p>
     * Specify the natively-supported Amazon Web Services service to add as a source in Security Lake.
     * </p>
     * 
     * @param sources
     *        Specify the natively-supported Amazon Web Services service to add as a source in Security Lake.
     */

    public void setSources(java.util.Collection<AwsLogSourceConfiguration> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<AwsLogSourceConfiguration>(sources);
    }

    /**
     * <p>
     * Specify the natively-supported Amazon Web Services service to add as a source in Security Lake.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        Specify the natively-supported Amazon Web Services service to add as a source in Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceRequest withSources(AwsLogSourceConfiguration... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<AwsLogSourceConfiguration>(sources.length));
        }
        for (AwsLogSourceConfiguration ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify the natively-supported Amazon Web Services service to add as a source in Security Lake.
     * </p>
     * 
     * @param sources
     *        Specify the natively-supported Amazon Web Services service to add as a source in Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceRequest withSources(java.util.Collection<AwsLogSourceConfiguration> sources) {
        setSources(sources);
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
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAwsLogSourceRequest == false)
            return false;
        CreateAwsLogSourceRequest other = (CreateAwsLogSourceRequest) obj;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public CreateAwsLogSourceRequest clone() {
        return (CreateAwsLogSourceRequest) super.clone();
    }

}
