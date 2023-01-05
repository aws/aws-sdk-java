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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseConversionTaskForResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLicenseConversionTaskForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource you are converting the license type for.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Information that identifies the license type you are converting from. For the structure of the source license,
     * see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     * >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     * </p>
     */
    private LicenseConversionContext sourceLicenseContext;
    /**
     * <p>
     * Information that identifies the license type you are converting to. For the structure of the destination license,
     * see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     * >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     * </p>
     */
    private LicenseConversionContext destinationLicenseContext;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource you are converting the license type for.
     * </p>
     * 
     * @param resourceArn
     *        Amazon Resource Name (ARN) of the resource you are converting the license type for.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource you are converting the license type for.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the resource you are converting the license type for.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the resource you are converting the license type for.
     * </p>
     * 
     * @param resourceArn
     *        Amazon Resource Name (ARN) of the resource you are converting the license type for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseConversionTaskForResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Information that identifies the license type you are converting from. For the structure of the source license,
     * see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     * >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     * </p>
     * 
     * @param sourceLicenseContext
     *        Information that identifies the license type you are converting from. For the structure of the source
     *        license, see <a href=
     *        "https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     *        >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     */

    public void setSourceLicenseContext(LicenseConversionContext sourceLicenseContext) {
        this.sourceLicenseContext = sourceLicenseContext;
    }

    /**
     * <p>
     * Information that identifies the license type you are converting from. For the structure of the source license,
     * see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     * >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     * </p>
     * 
     * @return Information that identifies the license type you are converting from. For the structure of the source
     *         license, see <a href=
     *         "https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     *         >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     */

    public LicenseConversionContext getSourceLicenseContext() {
        return this.sourceLicenseContext;
    }

    /**
     * <p>
     * Information that identifies the license type you are converting from. For the structure of the source license,
     * see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     * >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     * </p>
     * 
     * @param sourceLicenseContext
     *        Information that identifies the license type you are converting from. For the structure of the source
     *        license, see <a href=
     *        "https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     *        >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseConversionTaskForResourceRequest withSourceLicenseContext(LicenseConversionContext sourceLicenseContext) {
        setSourceLicenseContext(sourceLicenseContext);
        return this;
    }

    /**
     * <p>
     * Information that identifies the license type you are converting to. For the structure of the destination license,
     * see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     * >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     * </p>
     * 
     * @param destinationLicenseContext
     *        Information that identifies the license type you are converting to. For the structure of the destination
     *        license, see <a href=
     *        "https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     *        >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     */

    public void setDestinationLicenseContext(LicenseConversionContext destinationLicenseContext) {
        this.destinationLicenseContext = destinationLicenseContext;
    }

    /**
     * <p>
     * Information that identifies the license type you are converting to. For the structure of the destination license,
     * see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     * >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     * </p>
     * 
     * @return Information that identifies the license type you are converting to. For the structure of the destination
     *         license, see <a href=
     *         "https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     *         >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     */

    public LicenseConversionContext getDestinationLicenseContext() {
        return this.destinationLicenseContext;
    }

    /**
     * <p>
     * Information that identifies the license type you are converting to. For the structure of the destination license,
     * see <a
     * href="https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     * >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     * </p>
     * 
     * @param destinationLicenseContext
     *        Information that identifies the license type you are converting to. For the structure of the destination
     *        license, see <a href=
     *        "https://docs.aws.amazon.com/license-manager/latest/userguide/conversion-procedures.html#conversion-cli"
     *        >Convert a license type using the Amazon Web Services CLI</a> in the <i>License Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseConversionTaskForResourceRequest withDestinationLicenseContext(LicenseConversionContext destinationLicenseContext) {
        setDestinationLicenseContext(destinationLicenseContext);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getSourceLicenseContext() != null)
            sb.append("SourceLicenseContext: ").append(getSourceLicenseContext()).append(",");
        if (getDestinationLicenseContext() != null)
            sb.append("DestinationLicenseContext: ").append(getDestinationLicenseContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLicenseConversionTaskForResourceRequest == false)
            return false;
        CreateLicenseConversionTaskForResourceRequest other = (CreateLicenseConversionTaskForResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getSourceLicenseContext() == null ^ this.getSourceLicenseContext() == null)
            return false;
        if (other.getSourceLicenseContext() != null && other.getSourceLicenseContext().equals(this.getSourceLicenseContext()) == false)
            return false;
        if (other.getDestinationLicenseContext() == null ^ this.getDestinationLicenseContext() == null)
            return false;
        if (other.getDestinationLicenseContext() != null && other.getDestinationLicenseContext().equals(this.getDestinationLicenseContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getSourceLicenseContext() == null) ? 0 : getSourceLicenseContext().hashCode());
        hashCode = prime * hashCode + ((getDestinationLicenseContext() == null) ? 0 : getDestinationLicenseContext().hashCode());
        return hashCode;
    }

    @Override
    public CreateLicenseConversionTaskForResourceRequest clone() {
        return (CreateLicenseConversionTaskForResourceRequest) super.clone();
    }

}
