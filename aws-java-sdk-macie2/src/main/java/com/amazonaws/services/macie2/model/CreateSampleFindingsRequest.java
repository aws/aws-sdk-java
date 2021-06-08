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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateSampleFindings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSampleFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array that lists one or more types of findings to include in the set of sample findings. Currently, the only
     * supported value is Policy:IAMUser/S3BucketEncryptionDisabled.
     * </p>
     */
    private java.util.List<String> findingTypes;

    /**
     * <p>
     * An array that lists one or more types of findings to include in the set of sample findings. Currently, the only
     * supported value is Policy:IAMUser/S3BucketEncryptionDisabled.
     * </p>
     * 
     * @return An array that lists one or more types of findings to include in the set of sample findings. Currently,
     *         the only supported value is Policy:IAMUser/S3BucketEncryptionDisabled.
     * @see FindingType
     */

    public java.util.List<String> getFindingTypes() {
        return findingTypes;
    }

    /**
     * <p>
     * An array that lists one or more types of findings to include in the set of sample findings. Currently, the only
     * supported value is Policy:IAMUser/S3BucketEncryptionDisabled.
     * </p>
     * 
     * @param findingTypes
     *        An array that lists one or more types of findings to include in the set of sample findings. Currently, the
     *        only supported value is Policy:IAMUser/S3BucketEncryptionDisabled.
     * @see FindingType
     */

    public void setFindingTypes(java.util.Collection<String> findingTypes) {
        if (findingTypes == null) {
            this.findingTypes = null;
            return;
        }

        this.findingTypes = new java.util.ArrayList<String>(findingTypes);
    }

    /**
     * <p>
     * An array that lists one or more types of findings to include in the set of sample findings. Currently, the only
     * supported value is Policy:IAMUser/S3BucketEncryptionDisabled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingTypes(java.util.Collection)} or {@link #withFindingTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param findingTypes
     *        An array that lists one or more types of findings to include in the set of sample findings. Currently, the
     *        only supported value is Policy:IAMUser/S3BucketEncryptionDisabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingType
     */

    public CreateSampleFindingsRequest withFindingTypes(String... findingTypes) {
        if (this.findingTypes == null) {
            setFindingTypes(new java.util.ArrayList<String>(findingTypes.length));
        }
        for (String ele : findingTypes) {
            this.findingTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists one or more types of findings to include in the set of sample findings. Currently, the only
     * supported value is Policy:IAMUser/S3BucketEncryptionDisabled.
     * </p>
     * 
     * @param findingTypes
     *        An array that lists one or more types of findings to include in the set of sample findings. Currently, the
     *        only supported value is Policy:IAMUser/S3BucketEncryptionDisabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingType
     */

    public CreateSampleFindingsRequest withFindingTypes(java.util.Collection<String> findingTypes) {
        setFindingTypes(findingTypes);
        return this;
    }

    /**
     * <p>
     * An array that lists one or more types of findings to include in the set of sample findings. Currently, the only
     * supported value is Policy:IAMUser/S3BucketEncryptionDisabled.
     * </p>
     * 
     * @param findingTypes
     *        An array that lists one or more types of findings to include in the set of sample findings. Currently, the
     *        only supported value is Policy:IAMUser/S3BucketEncryptionDisabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingType
     */

    public CreateSampleFindingsRequest withFindingTypes(FindingType... findingTypes) {
        java.util.ArrayList<String> findingTypesCopy = new java.util.ArrayList<String>(findingTypes.length);
        for (FindingType value : findingTypes) {
            findingTypesCopy.add(value.toString());
        }
        if (getFindingTypes() == null) {
            setFindingTypes(findingTypesCopy);
        } else {
            getFindingTypes().addAll(findingTypesCopy);
        }
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
        if (getFindingTypes() != null)
            sb.append("FindingTypes: ").append(getFindingTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSampleFindingsRequest == false)
            return false;
        CreateSampleFindingsRequest other = (CreateSampleFindingsRequest) obj;
        if (other.getFindingTypes() == null ^ this.getFindingTypes() == null)
            return false;
        if (other.getFindingTypes() != null && other.getFindingTypes().equals(this.getFindingTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingTypes() == null) ? 0 : getFindingTypes().hashCode());
        return hashCode;
    }

    @Override
    public CreateSampleFindingsRequest clone() {
        return (CreateSampleFindingsRequest) super.clone();
    }

}
