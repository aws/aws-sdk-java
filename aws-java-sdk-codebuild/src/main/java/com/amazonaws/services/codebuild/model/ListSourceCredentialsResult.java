/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListSourceCredentials" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSourceCredentialsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>SourceCredentialsInfo</code> objects. Each <code>SourceCredentialsInfo</code> object includes the
     * authentication type, token ARN, and type of source provider for one set of credentials.
     * </p>
     */
    private java.util.List<SourceCredentialsInfo> sourceCredentialsInfos;

    /**
     * <p>
     * A list of <code>SourceCredentialsInfo</code> objects. Each <code>SourceCredentialsInfo</code> object includes the
     * authentication type, token ARN, and type of source provider for one set of credentials.
     * </p>
     * 
     * @return A list of <code>SourceCredentialsInfo</code> objects. Each <code>SourceCredentialsInfo</code> object
     *         includes the authentication type, token ARN, and type of source provider for one set of credentials.
     */

    public java.util.List<SourceCredentialsInfo> getSourceCredentialsInfos() {
        return sourceCredentialsInfos;
    }

    /**
     * <p>
     * A list of <code>SourceCredentialsInfo</code> objects. Each <code>SourceCredentialsInfo</code> object includes the
     * authentication type, token ARN, and type of source provider for one set of credentials.
     * </p>
     * 
     * @param sourceCredentialsInfos
     *        A list of <code>SourceCredentialsInfo</code> objects. Each <code>SourceCredentialsInfo</code> object
     *        includes the authentication type, token ARN, and type of source provider for one set of credentials.
     */

    public void setSourceCredentialsInfos(java.util.Collection<SourceCredentialsInfo> sourceCredentialsInfos) {
        if (sourceCredentialsInfos == null) {
            this.sourceCredentialsInfos = null;
            return;
        }

        this.sourceCredentialsInfos = new java.util.ArrayList<SourceCredentialsInfo>(sourceCredentialsInfos);
    }

    /**
     * <p>
     * A list of <code>SourceCredentialsInfo</code> objects. Each <code>SourceCredentialsInfo</code> object includes the
     * authentication type, token ARN, and type of source provider for one set of credentials.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceCredentialsInfos(java.util.Collection)} or
     * {@link #withSourceCredentialsInfos(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sourceCredentialsInfos
     *        A list of <code>SourceCredentialsInfo</code> objects. Each <code>SourceCredentialsInfo</code> object
     *        includes the authentication type, token ARN, and type of source provider for one set of credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSourceCredentialsResult withSourceCredentialsInfos(SourceCredentialsInfo... sourceCredentialsInfos) {
        if (this.sourceCredentialsInfos == null) {
            setSourceCredentialsInfos(new java.util.ArrayList<SourceCredentialsInfo>(sourceCredentialsInfos.length));
        }
        for (SourceCredentialsInfo ele : sourceCredentialsInfos) {
            this.sourceCredentialsInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>SourceCredentialsInfo</code> objects. Each <code>SourceCredentialsInfo</code> object includes the
     * authentication type, token ARN, and type of source provider for one set of credentials.
     * </p>
     * 
     * @param sourceCredentialsInfos
     *        A list of <code>SourceCredentialsInfo</code> objects. Each <code>SourceCredentialsInfo</code> object
     *        includes the authentication type, token ARN, and type of source provider for one set of credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSourceCredentialsResult withSourceCredentialsInfos(java.util.Collection<SourceCredentialsInfo> sourceCredentialsInfos) {
        setSourceCredentialsInfos(sourceCredentialsInfos);
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
        if (getSourceCredentialsInfos() != null)
            sb.append("SourceCredentialsInfos: ").append(getSourceCredentialsInfos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSourceCredentialsResult == false)
            return false;
        ListSourceCredentialsResult other = (ListSourceCredentialsResult) obj;
        if (other.getSourceCredentialsInfos() == null ^ this.getSourceCredentialsInfos() == null)
            return false;
        if (other.getSourceCredentialsInfos() != null && other.getSourceCredentialsInfos().equals(this.getSourceCredentialsInfos()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceCredentialsInfos() == null) ? 0 : getSourceCredentialsInfos().hashCode());
        return hashCode;
    }

    @Override
    public ListSourceCredentialsResult clone() {
        try {
            return (ListSourceCredentialsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
