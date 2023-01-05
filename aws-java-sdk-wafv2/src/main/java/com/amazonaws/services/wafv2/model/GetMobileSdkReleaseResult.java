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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetMobileSdkRelease" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMobileSdkReleaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information for a specified SDK release, including release notes and tags.
     * </p>
     */
    private MobileSdkRelease mobileSdkRelease;

    /**
     * <p>
     * Information for a specified SDK release, including release notes and tags.
     * </p>
     * 
     * @param mobileSdkRelease
     *        Information for a specified SDK release, including release notes and tags.
     */

    public void setMobileSdkRelease(MobileSdkRelease mobileSdkRelease) {
        this.mobileSdkRelease = mobileSdkRelease;
    }

    /**
     * <p>
     * Information for a specified SDK release, including release notes and tags.
     * </p>
     * 
     * @return Information for a specified SDK release, including release notes and tags.
     */

    public MobileSdkRelease getMobileSdkRelease() {
        return this.mobileSdkRelease;
    }

    /**
     * <p>
     * Information for a specified SDK release, including release notes and tags.
     * </p>
     * 
     * @param mobileSdkRelease
     *        Information for a specified SDK release, including release notes and tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMobileSdkReleaseResult withMobileSdkRelease(MobileSdkRelease mobileSdkRelease) {
        setMobileSdkRelease(mobileSdkRelease);
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
        if (getMobileSdkRelease() != null)
            sb.append("MobileSdkRelease: ").append(getMobileSdkRelease());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMobileSdkReleaseResult == false)
            return false;
        GetMobileSdkReleaseResult other = (GetMobileSdkReleaseResult) obj;
        if (other.getMobileSdkRelease() == null ^ this.getMobileSdkRelease() == null)
            return false;
        if (other.getMobileSdkRelease() != null && other.getMobileSdkRelease().equals(this.getMobileSdkRelease()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMobileSdkRelease() == null) ? 0 : getMobileSdkRelease().hashCode());
        return hashCode;
    }

    @Override
    public GetMobileSdkReleaseResult clone() {
        try {
            return (GetMobileSdkReleaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
