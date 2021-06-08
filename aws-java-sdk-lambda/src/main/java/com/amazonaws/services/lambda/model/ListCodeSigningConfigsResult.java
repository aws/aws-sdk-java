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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListCodeSigningConfigs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCodeSigningConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The code signing configurations
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CodeSigningConfig> codeSigningConfigs;

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextMarker
     *        The pagination token that's included if more results are available.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @return The pagination token that's included if more results are available.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextMarker
     *        The pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCodeSigningConfigsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The code signing configurations
     * </p>
     * 
     * @return The code signing configurations
     */

    public java.util.List<CodeSigningConfig> getCodeSigningConfigs() {
        if (codeSigningConfigs == null) {
            codeSigningConfigs = new com.amazonaws.internal.SdkInternalList<CodeSigningConfig>();
        }
        return codeSigningConfigs;
    }

    /**
     * <p>
     * The code signing configurations
     * </p>
     * 
     * @param codeSigningConfigs
     *        The code signing configurations
     */

    public void setCodeSigningConfigs(java.util.Collection<CodeSigningConfig> codeSigningConfigs) {
        if (codeSigningConfigs == null) {
            this.codeSigningConfigs = null;
            return;
        }

        this.codeSigningConfigs = new com.amazonaws.internal.SdkInternalList<CodeSigningConfig>(codeSigningConfigs);
    }

    /**
     * <p>
     * The code signing configurations
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCodeSigningConfigs(java.util.Collection)} or {@link #withCodeSigningConfigs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param codeSigningConfigs
     *        The code signing configurations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCodeSigningConfigsResult withCodeSigningConfigs(CodeSigningConfig... codeSigningConfigs) {
        if (this.codeSigningConfigs == null) {
            setCodeSigningConfigs(new com.amazonaws.internal.SdkInternalList<CodeSigningConfig>(codeSigningConfigs.length));
        }
        for (CodeSigningConfig ele : codeSigningConfigs) {
            this.codeSigningConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The code signing configurations
     * </p>
     * 
     * @param codeSigningConfigs
     *        The code signing configurations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCodeSigningConfigsResult withCodeSigningConfigs(java.util.Collection<CodeSigningConfig> codeSigningConfigs) {
        setCodeSigningConfigs(codeSigningConfigs);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getCodeSigningConfigs() != null)
            sb.append("CodeSigningConfigs: ").append(getCodeSigningConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCodeSigningConfigsResult == false)
            return false;
        ListCodeSigningConfigsResult other = (ListCodeSigningConfigsResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getCodeSigningConfigs() == null ^ this.getCodeSigningConfigs() == null)
            return false;
        if (other.getCodeSigningConfigs() != null && other.getCodeSigningConfigs().equals(this.getCodeSigningConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getCodeSigningConfigs() == null) ? 0 : getCodeSigningConfigs().hashCode());
        return hashCode;
    }

    @Override
    public ListCodeSigningConfigsResult clone() {
        try {
            return (ListCodeSigningConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
