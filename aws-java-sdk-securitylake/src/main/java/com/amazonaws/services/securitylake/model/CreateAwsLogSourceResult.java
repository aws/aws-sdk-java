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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateAwsLogSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAwsLogSourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists all accounts in which enabling a natively supported Amazon Web Service as a Security Lake source failed.
     * The failure occurred as these accounts are not part of an organization.
     * </p>
     */
    private java.util.List<String> failed;
    /**
     * <p>
     * Lists the accounts that are in the process of enabling a natively supported Amazon Web Service as a Security Lake
     * source.
     * </p>
     */
    private java.util.List<String> processing;

    /**
     * <p>
     * Lists all accounts in which enabling a natively supported Amazon Web Service as a Security Lake source failed.
     * The failure occurred as these accounts are not part of an organization.
     * </p>
     * 
     * @return Lists all accounts in which enabling a natively supported Amazon Web Service as a Security Lake source
     *         failed. The failure occurred as these accounts are not part of an organization.
     */

    public java.util.List<String> getFailed() {
        return failed;
    }

    /**
     * <p>
     * Lists all accounts in which enabling a natively supported Amazon Web Service as a Security Lake source failed.
     * The failure occurred as these accounts are not part of an organization.
     * </p>
     * 
     * @param failed
     *        Lists all accounts in which enabling a natively supported Amazon Web Service as a Security Lake source
     *        failed. The failure occurred as these accounts are not part of an organization.
     */

    public void setFailed(java.util.Collection<String> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }

        this.failed = new java.util.ArrayList<String>(failed);
    }

    /**
     * <p>
     * Lists all accounts in which enabling a natively supported Amazon Web Service as a Security Lake source failed.
     * The failure occurred as these accounts are not part of an organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailed(java.util.Collection)} or {@link #withFailed(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param failed
     *        Lists all accounts in which enabling a natively supported Amazon Web Service as a Security Lake source
     *        failed. The failure occurred as these accounts are not part of an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceResult withFailed(String... failed) {
        if (this.failed == null) {
            setFailed(new java.util.ArrayList<String>(failed.length));
        }
        for (String ele : failed) {
            this.failed.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists all accounts in which enabling a natively supported Amazon Web Service as a Security Lake source failed.
     * The failure occurred as these accounts are not part of an organization.
     * </p>
     * 
     * @param failed
     *        Lists all accounts in which enabling a natively supported Amazon Web Service as a Security Lake source
     *        failed. The failure occurred as these accounts are not part of an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceResult withFailed(java.util.Collection<String> failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * Lists the accounts that are in the process of enabling a natively supported Amazon Web Service as a Security Lake
     * source.
     * </p>
     * 
     * @return Lists the accounts that are in the process of enabling a natively supported Amazon Web Service as a
     *         Security Lake source.
     */

    public java.util.List<String> getProcessing() {
        return processing;
    }

    /**
     * <p>
     * Lists the accounts that are in the process of enabling a natively supported Amazon Web Service as a Security Lake
     * source.
     * </p>
     * 
     * @param processing
     *        Lists the accounts that are in the process of enabling a natively supported Amazon Web Service as a
     *        Security Lake source.
     */

    public void setProcessing(java.util.Collection<String> processing) {
        if (processing == null) {
            this.processing = null;
            return;
        }

        this.processing = new java.util.ArrayList<String>(processing);
    }

    /**
     * <p>
     * Lists the accounts that are in the process of enabling a natively supported Amazon Web Service as a Security Lake
     * source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessing(java.util.Collection)} or {@link #withProcessing(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param processing
     *        Lists the accounts that are in the process of enabling a natively supported Amazon Web Service as a
     *        Security Lake source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceResult withProcessing(String... processing) {
        if (this.processing == null) {
            setProcessing(new java.util.ArrayList<String>(processing.length));
        }
        for (String ele : processing) {
            this.processing.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the accounts that are in the process of enabling a natively supported Amazon Web Service as a Security Lake
     * source.
     * </p>
     * 
     * @param processing
     *        Lists the accounts that are in the process of enabling a natively supported Amazon Web Service as a
     *        Security Lake source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAwsLogSourceResult withProcessing(java.util.Collection<String> processing) {
        setProcessing(processing);
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
        if (getFailed() != null)
            sb.append("Failed: ").append(getFailed()).append(",");
        if (getProcessing() != null)
            sb.append("Processing: ").append(getProcessing());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAwsLogSourceResult == false)
            return false;
        CreateAwsLogSourceResult other = (CreateAwsLogSourceResult) obj;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getProcessing() == null ^ this.getProcessing() == null)
            return false;
        if (other.getProcessing() != null && other.getProcessing().equals(this.getProcessing()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getProcessing() == null) ? 0 : getProcessing().hashCode());
        return hashCode;
    }

    @Override
    public CreateAwsLogSourceResult clone() {
        try {
            return (CreateAwsLogSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
