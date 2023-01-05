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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPointPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMultiRegionAccessPointPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Specifies the Multi-Region Access Point. The name of the Multi-Region Access Point is different from the alias.
     * For more information about the distinction between the name and the alias of an Multi-Region Access Point, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     * >Managing Multi-Region Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMultiRegionAccessPointPolicyRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Specifies the Multi-Region Access Point. The name of the Multi-Region Access Point is different from the alias.
     * For more information about the distinction between the name and the alias of an Multi-Region Access Point, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     * >Managing Multi-Region Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param name
     *        Specifies the Multi-Region Access Point. The name of the Multi-Region Access Point is different from the
     *        alias. For more information about the distinction between the name and the alias of an Multi-Region Access
     *        Point, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     *        >Managing Multi-Region Access Points</a> in the <i>Amazon S3 User Guide</i>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the Multi-Region Access Point. The name of the Multi-Region Access Point is different from the alias.
     * For more information about the distinction between the name and the alias of an Multi-Region Access Point, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     * >Managing Multi-Region Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return Specifies the Multi-Region Access Point. The name of the Multi-Region Access Point is different from the
     *         alias. For more information about the distinction between the name and the alias of an Multi-Region
     *         Access Point, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     *         >Managing Multi-Region Access Points</a> in the <i>Amazon S3 User Guide</i>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the Multi-Region Access Point. The name of the Multi-Region Access Point is different from the alias.
     * For more information about the distinction between the name and the alias of an Multi-Region Access Point, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     * >Managing Multi-Region Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param name
     *        Specifies the Multi-Region Access Point. The name of the Multi-Region Access Point is different from the
     *        alias. For more information about the distinction between the name and the alias of an Multi-Region Access
     *        Point, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html#multi-region-access-point-naming"
     *        >Managing Multi-Region Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMultiRegionAccessPointPolicyRequest withName(String name) {
        setName(name);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMultiRegionAccessPointPolicyRequest == false)
            return false;
        GetMultiRegionAccessPointPolicyRequest other = (GetMultiRegionAccessPointPolicyRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public GetMultiRegionAccessPointPolicyRequest clone() {
        return (GetMultiRegionAccessPointPolicyRequest) super.clone();
    }

}
