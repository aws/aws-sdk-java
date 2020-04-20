/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/VerifyResourcesExistForTagris"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyResourcesExistForTagrisResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private java.util.Map<String, String> tagrisSweepListResult;

    /**
     * @return
     */

    public java.util.Map<String, String> getTagrisSweepListResult() {
        return tagrisSweepListResult;
    }

    /**
     * @param tagrisSweepListResult
     */

    public void setTagrisSweepListResult(java.util.Map<String, String> tagrisSweepListResult) {
        this.tagrisSweepListResult = tagrisSweepListResult;
    }

    /**
     * @param tagrisSweepListResult
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyResourcesExistForTagrisResult withTagrisSweepListResult(java.util.Map<String, String> tagrisSweepListResult) {
        setTagrisSweepListResult(tagrisSweepListResult);
        return this;
    }

    /**
     * Add a single TagrisSweepListResult entry
     *
     * @see VerifyResourcesExistForTagrisResult#withTagrisSweepListResult
     * @returns a reference to this object so that method calls can be chained together.
     */

    public VerifyResourcesExistForTagrisResult addTagrisSweepListResultEntry(String key, String value) {
        if (null == this.tagrisSweepListResult) {
            this.tagrisSweepListResult = new java.util.HashMap<String, String>();
        }
        if (this.tagrisSweepListResult.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tagrisSweepListResult.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TagrisSweepListResult.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyResourcesExistForTagrisResult clearTagrisSweepListResultEntries() {
        this.tagrisSweepListResult = null;
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
        if (getTagrisSweepListResult() != null)
            sb.append("TagrisSweepListResult: ").append(getTagrisSweepListResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyResourcesExistForTagrisResult == false)
            return false;
        VerifyResourcesExistForTagrisResult other = (VerifyResourcesExistForTagrisResult) obj;
        if (other.getTagrisSweepListResult() == null ^ this.getTagrisSweepListResult() == null)
            return false;
        if (other.getTagrisSweepListResult() != null && other.getTagrisSweepListResult().equals(this.getTagrisSweepListResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagrisSweepListResult() == null) ? 0 : getTagrisSweepListResult().hashCode());
        return hashCode;
    }

    @Override
    public VerifyResourcesExistForTagrisResult clone() {
        try {
            return (VerifyResourcesExistForTagrisResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
