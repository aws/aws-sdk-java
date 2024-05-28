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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetComponentVersionArtifact"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComponentVersionArtifactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version. Specify the ARN of a public or a Lambda component version.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the artifact.
     * </p>
     * <p>
     * You can use the <a
     * href="https://docs.aws.amazon.com/greengrass/v2/APIReference/API_GetComponent.html">GetComponent</a> operation to
     * download the component recipe, which includes the URI of the artifact. The artifact name is the section of the
     * URI after the scheme. For example, in the artifact URI <code>greengrass:SomeArtifact.zip</code>, the artifact
     * name is <code>SomeArtifact.zip</code>.
     * </p>
     */
    private String artifactName;
    /**
     * <p>
     * Specifies the endpoint to use when getting Amazon S3 pre-signed URLs.
     * </p>
     * <p>
     * All Amazon Web Services Regions except US East (N. Virginia) use <code>REGIONAL</code> in all cases. In the US
     * East (N. Virginia) Region the default is <code>GLOBAL</code>, but you can change it to <code>REGIONAL</code> with
     * this parameter.
     * </p>
     */
    private String s3EndpointType;
    /**
     * <p>
     * Determines if the Amazon S3 URL returned is a FIPS pre-signed URL endpoint. Specify <code>fips</code> if you want
     * the returned Amazon S3 pre-signed URL to point to an Amazon S3 FIPS endpoint. If you don't specify a value, the
     * default is <code>standard</code>.
     * </p>
     */
    private String iotEndpointType;

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version. Specify the ARN of a public or a Lambda component version.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        component version. Specify the ARN of a public or a Lambda component version.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version. Specify the ARN of a public or a Lambda component version.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         component version. Specify the ARN of a public or a Lambda component version.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version. Specify the ARN of a public or a Lambda component version.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        component version. Specify the ARN of a public or a Lambda component version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentVersionArtifactRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the artifact.
     * </p>
     * <p>
     * You can use the <a
     * href="https://docs.aws.amazon.com/greengrass/v2/APIReference/API_GetComponent.html">GetComponent</a> operation to
     * download the component recipe, which includes the URI of the artifact. The artifact name is the section of the
     * URI after the scheme. For example, in the artifact URI <code>greengrass:SomeArtifact.zip</code>, the artifact
     * name is <code>SomeArtifact.zip</code>.
     * </p>
     * 
     * @param artifactName
     *        The name of the artifact.</p>
     *        <p>
     *        You can use the <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/APIReference/API_GetComponent.html">GetComponent</a>
     *        operation to download the component recipe, which includes the URI of the artifact. The artifact name is
     *        the section of the URI after the scheme. For example, in the artifact URI
     *        <code>greengrass:SomeArtifact.zip</code>, the artifact name is <code>SomeArtifact.zip</code>.
     */

    public void setArtifactName(String artifactName) {
        this.artifactName = artifactName;
    }

    /**
     * <p>
     * The name of the artifact.
     * </p>
     * <p>
     * You can use the <a
     * href="https://docs.aws.amazon.com/greengrass/v2/APIReference/API_GetComponent.html">GetComponent</a> operation to
     * download the component recipe, which includes the URI of the artifact. The artifact name is the section of the
     * URI after the scheme. For example, in the artifact URI <code>greengrass:SomeArtifact.zip</code>, the artifact
     * name is <code>SomeArtifact.zip</code>.
     * </p>
     * 
     * @return The name of the artifact.</p>
     *         <p>
     *         You can use the <a
     *         href="https://docs.aws.amazon.com/greengrass/v2/APIReference/API_GetComponent.html">GetComponent</a>
     *         operation to download the component recipe, which includes the URI of the artifact. The artifact name is
     *         the section of the URI after the scheme. For example, in the artifact URI
     *         <code>greengrass:SomeArtifact.zip</code>, the artifact name is <code>SomeArtifact.zip</code>.
     */

    public String getArtifactName() {
        return this.artifactName;
    }

    /**
     * <p>
     * The name of the artifact.
     * </p>
     * <p>
     * You can use the <a
     * href="https://docs.aws.amazon.com/greengrass/v2/APIReference/API_GetComponent.html">GetComponent</a> operation to
     * download the component recipe, which includes the URI of the artifact. The artifact name is the section of the
     * URI after the scheme. For example, in the artifact URI <code>greengrass:SomeArtifact.zip</code>, the artifact
     * name is <code>SomeArtifact.zip</code>.
     * </p>
     * 
     * @param artifactName
     *        The name of the artifact.</p>
     *        <p>
     *        You can use the <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/APIReference/API_GetComponent.html">GetComponent</a>
     *        operation to download the component recipe, which includes the URI of the artifact. The artifact name is
     *        the section of the URI after the scheme. For example, in the artifact URI
     *        <code>greengrass:SomeArtifact.zip</code>, the artifact name is <code>SomeArtifact.zip</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentVersionArtifactRequest withArtifactName(String artifactName) {
        setArtifactName(artifactName);
        return this;
    }

    /**
     * <p>
     * Specifies the endpoint to use when getting Amazon S3 pre-signed URLs.
     * </p>
     * <p>
     * All Amazon Web Services Regions except US East (N. Virginia) use <code>REGIONAL</code> in all cases. In the US
     * East (N. Virginia) Region the default is <code>GLOBAL</code>, but you can change it to <code>REGIONAL</code> with
     * this parameter.
     * </p>
     * 
     * @param s3EndpointType
     *        Specifies the endpoint to use when getting Amazon S3 pre-signed URLs.</p>
     *        <p>
     *        All Amazon Web Services Regions except US East (N. Virginia) use <code>REGIONAL</code> in all cases. In
     *        the US East (N. Virginia) Region the default is <code>GLOBAL</code>, but you can change it to
     *        <code>REGIONAL</code> with this parameter.
     * @see S3EndpointType
     */

    public void setS3EndpointType(String s3EndpointType) {
        this.s3EndpointType = s3EndpointType;
    }

    /**
     * <p>
     * Specifies the endpoint to use when getting Amazon S3 pre-signed URLs.
     * </p>
     * <p>
     * All Amazon Web Services Regions except US East (N. Virginia) use <code>REGIONAL</code> in all cases. In the US
     * East (N. Virginia) Region the default is <code>GLOBAL</code>, but you can change it to <code>REGIONAL</code> with
     * this parameter.
     * </p>
     * 
     * @return Specifies the endpoint to use when getting Amazon S3 pre-signed URLs.</p>
     *         <p>
     *         All Amazon Web Services Regions except US East (N. Virginia) use <code>REGIONAL</code> in all cases. In
     *         the US East (N. Virginia) Region the default is <code>GLOBAL</code>, but you can change it to
     *         <code>REGIONAL</code> with this parameter.
     * @see S3EndpointType
     */

    public String getS3EndpointType() {
        return this.s3EndpointType;
    }

    /**
     * <p>
     * Specifies the endpoint to use when getting Amazon S3 pre-signed URLs.
     * </p>
     * <p>
     * All Amazon Web Services Regions except US East (N. Virginia) use <code>REGIONAL</code> in all cases. In the US
     * East (N. Virginia) Region the default is <code>GLOBAL</code>, but you can change it to <code>REGIONAL</code> with
     * this parameter.
     * </p>
     * 
     * @param s3EndpointType
     *        Specifies the endpoint to use when getting Amazon S3 pre-signed URLs.</p>
     *        <p>
     *        All Amazon Web Services Regions except US East (N. Virginia) use <code>REGIONAL</code> in all cases. In
     *        the US East (N. Virginia) Region the default is <code>GLOBAL</code>, but you can change it to
     *        <code>REGIONAL</code> with this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3EndpointType
     */

    public GetComponentVersionArtifactRequest withS3EndpointType(String s3EndpointType) {
        setS3EndpointType(s3EndpointType);
        return this;
    }

    /**
     * <p>
     * Specifies the endpoint to use when getting Amazon S3 pre-signed URLs.
     * </p>
     * <p>
     * All Amazon Web Services Regions except US East (N. Virginia) use <code>REGIONAL</code> in all cases. In the US
     * East (N. Virginia) Region the default is <code>GLOBAL</code>, but you can change it to <code>REGIONAL</code> with
     * this parameter.
     * </p>
     * 
     * @param s3EndpointType
     *        Specifies the endpoint to use when getting Amazon S3 pre-signed URLs.</p>
     *        <p>
     *        All Amazon Web Services Regions except US East (N. Virginia) use <code>REGIONAL</code> in all cases. In
     *        the US East (N. Virginia) Region the default is <code>GLOBAL</code>, but you can change it to
     *        <code>REGIONAL</code> with this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3EndpointType
     */

    public GetComponentVersionArtifactRequest withS3EndpointType(S3EndpointType s3EndpointType) {
        this.s3EndpointType = s3EndpointType.toString();
        return this;
    }

    /**
     * <p>
     * Determines if the Amazon S3 URL returned is a FIPS pre-signed URL endpoint. Specify <code>fips</code> if you want
     * the returned Amazon S3 pre-signed URL to point to an Amazon S3 FIPS endpoint. If you don't specify a value, the
     * default is <code>standard</code>.
     * </p>
     * 
     * @param iotEndpointType
     *        Determines if the Amazon S3 URL returned is a FIPS pre-signed URL endpoint. Specify <code>fips</code> if
     *        you want the returned Amazon S3 pre-signed URL to point to an Amazon S3 FIPS endpoint. If you don't
     *        specify a value, the default is <code>standard</code>.
     * @see IotEndpointType
     */

    public void setIotEndpointType(String iotEndpointType) {
        this.iotEndpointType = iotEndpointType;
    }

    /**
     * <p>
     * Determines if the Amazon S3 URL returned is a FIPS pre-signed URL endpoint. Specify <code>fips</code> if you want
     * the returned Amazon S3 pre-signed URL to point to an Amazon S3 FIPS endpoint. If you don't specify a value, the
     * default is <code>standard</code>.
     * </p>
     * 
     * @return Determines if the Amazon S3 URL returned is a FIPS pre-signed URL endpoint. Specify <code>fips</code> if
     *         you want the returned Amazon S3 pre-signed URL to point to an Amazon S3 FIPS endpoint. If you don't
     *         specify a value, the default is <code>standard</code>.
     * @see IotEndpointType
     */

    public String getIotEndpointType() {
        return this.iotEndpointType;
    }

    /**
     * <p>
     * Determines if the Amazon S3 URL returned is a FIPS pre-signed URL endpoint. Specify <code>fips</code> if you want
     * the returned Amazon S3 pre-signed URL to point to an Amazon S3 FIPS endpoint. If you don't specify a value, the
     * default is <code>standard</code>.
     * </p>
     * 
     * @param iotEndpointType
     *        Determines if the Amazon S3 URL returned is a FIPS pre-signed URL endpoint. Specify <code>fips</code> if
     *        you want the returned Amazon S3 pre-signed URL to point to an Amazon S3 FIPS endpoint. If you don't
     *        specify a value, the default is <code>standard</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IotEndpointType
     */

    public GetComponentVersionArtifactRequest withIotEndpointType(String iotEndpointType) {
        setIotEndpointType(iotEndpointType);
        return this;
    }

    /**
     * <p>
     * Determines if the Amazon S3 URL returned is a FIPS pre-signed URL endpoint. Specify <code>fips</code> if you want
     * the returned Amazon S3 pre-signed URL to point to an Amazon S3 FIPS endpoint. If you don't specify a value, the
     * default is <code>standard</code>.
     * </p>
     * 
     * @param iotEndpointType
     *        Determines if the Amazon S3 URL returned is a FIPS pre-signed URL endpoint. Specify <code>fips</code> if
     *        you want the returned Amazon S3 pre-signed URL to point to an Amazon S3 FIPS endpoint. If you don't
     *        specify a value, the default is <code>standard</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IotEndpointType
     */

    public GetComponentVersionArtifactRequest withIotEndpointType(IotEndpointType iotEndpointType) {
        this.iotEndpointType = iotEndpointType.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getArtifactName() != null)
            sb.append("ArtifactName: ").append(getArtifactName()).append(",");
        if (getS3EndpointType() != null)
            sb.append("S3EndpointType: ").append(getS3EndpointType()).append(",");
        if (getIotEndpointType() != null)
            sb.append("IotEndpointType: ").append(getIotEndpointType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComponentVersionArtifactRequest == false)
            return false;
        GetComponentVersionArtifactRequest other = (GetComponentVersionArtifactRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getArtifactName() == null ^ this.getArtifactName() == null)
            return false;
        if (other.getArtifactName() != null && other.getArtifactName().equals(this.getArtifactName()) == false)
            return false;
        if (other.getS3EndpointType() == null ^ this.getS3EndpointType() == null)
            return false;
        if (other.getS3EndpointType() != null && other.getS3EndpointType().equals(this.getS3EndpointType()) == false)
            return false;
        if (other.getIotEndpointType() == null ^ this.getIotEndpointType() == null)
            return false;
        if (other.getIotEndpointType() != null && other.getIotEndpointType().equals(this.getIotEndpointType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getArtifactName() == null) ? 0 : getArtifactName().hashCode());
        hashCode = prime * hashCode + ((getS3EndpointType() == null) ? 0 : getS3EndpointType().hashCode());
        hashCode = prime * hashCode + ((getIotEndpointType() == null) ? 0 : getIotEndpointType().hashCode());
        return hashCode;
    }

    @Override
    public GetComponentVersionArtifactRequest clone() {
        return (GetComponentVersionArtifactRequest) super.clone();
    }

}
