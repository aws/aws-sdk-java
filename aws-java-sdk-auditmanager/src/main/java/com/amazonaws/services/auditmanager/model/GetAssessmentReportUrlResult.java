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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetAssessmentReportUrl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssessmentReportUrlResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private URL preSignedUrl;

    /**
     * @param preSignedUrl
     */

    public void setPreSignedUrl(URL preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * @return
     */

    public URL getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * @param preSignedUrl
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssessmentReportUrlResult withPreSignedUrl(URL preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
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
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: ").append(getPreSignedUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssessmentReportUrlResult == false)
            return false;
        GetAssessmentReportUrlResult other = (GetAssessmentReportUrlResult) obj;
        if (other.getPreSignedUrl() == null ^ this.getPreSignedUrl() == null)
            return false;
        if (other.getPreSignedUrl() != null && other.getPreSignedUrl().equals(this.getPreSignedUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetAssessmentReportUrlResult clone() {
        try {
            return (GetAssessmentReportUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
