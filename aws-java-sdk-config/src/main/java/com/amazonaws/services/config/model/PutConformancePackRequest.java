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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConformancePack" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConformancePackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the conformance pack you want to create.
     * </p>
     */
    private String conformancePackName;
    /**
     * <p>
     * Location of file containing the template body (<code>s3://bucketname/prefix</code>). The uri must point to the
     * conformance pack template (max size: 300 KB) that is located in an Amazon S3 bucket in the same region as the
     * conformance pack.
     * </p>
     * <note>
     * <p>
     * You must have access to read Amazon S3 bucket.
     * </p>
     * </note>
     */
    private String templateS3Uri;
    /**
     * <p>
     * A string containing full conformance pack template body. Structure containing the template body with a minimum
     * length of 1 byte and a maximum length of 51,200 bytes.
     * </p>
     * <note>
     * <p>
     * You can only use a YAML template with one resource type, that is, config rule and a remediation action.
     * </p>
     * </note>
     */
    private String templateBody;
    /**
     * <p>
     * AWS Config stores intermediate files while processing conformance pack template.
     * </p>
     */
    private String deliveryS3Bucket;
    /**
     * <p>
     * The prefix for the Amazon S3 bucket.
     * </p>
     */
    private String deliveryS3KeyPrefix;
    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConformancePackInputParameter> conformancePackInputParameters;

    /**
     * <p>
     * Name of the conformance pack you want to create.
     * </p>
     * 
     * @param conformancePackName
     *        Name of the conformance pack you want to create.
     */

    public void setConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
    }

    /**
     * <p>
     * Name of the conformance pack you want to create.
     * </p>
     * 
     * @return Name of the conformance pack you want to create.
     */

    public String getConformancePackName() {
        return this.conformancePackName;
    }

    /**
     * <p>
     * Name of the conformance pack you want to create.
     * </p>
     * 
     * @param conformancePackName
     *        Name of the conformance pack you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConformancePackRequest withConformancePackName(String conformancePackName) {
        setConformancePackName(conformancePackName);
        return this;
    }

    /**
     * <p>
     * Location of file containing the template body (<code>s3://bucketname/prefix</code>). The uri must point to the
     * conformance pack template (max size: 300 KB) that is located in an Amazon S3 bucket in the same region as the
     * conformance pack.
     * </p>
     * <note>
     * <p>
     * You must have access to read Amazon S3 bucket.
     * </p>
     * </note>
     * 
     * @param templateS3Uri
     *        Location of file containing the template body (<code>s3://bucketname/prefix</code>). The uri must point to
     *        the conformance pack template (max size: 300 KB) that is located in an Amazon S3 bucket in the same region
     *        as the conformance pack. </p> <note>
     *        <p>
     *        You must have access to read Amazon S3 bucket.
     *        </p>
     */

    public void setTemplateS3Uri(String templateS3Uri) {
        this.templateS3Uri = templateS3Uri;
    }

    /**
     * <p>
     * Location of file containing the template body (<code>s3://bucketname/prefix</code>). The uri must point to the
     * conformance pack template (max size: 300 KB) that is located in an Amazon S3 bucket in the same region as the
     * conformance pack.
     * </p>
     * <note>
     * <p>
     * You must have access to read Amazon S3 bucket.
     * </p>
     * </note>
     * 
     * @return Location of file containing the template body (<code>s3://bucketname/prefix</code>). The uri must point
     *         to the conformance pack template (max size: 300 KB) that is located in an Amazon S3 bucket in the same
     *         region as the conformance pack. </p> <note>
     *         <p>
     *         You must have access to read Amazon S3 bucket.
     *         </p>
     */

    public String getTemplateS3Uri() {
        return this.templateS3Uri;
    }

    /**
     * <p>
     * Location of file containing the template body (<code>s3://bucketname/prefix</code>). The uri must point to the
     * conformance pack template (max size: 300 KB) that is located in an Amazon S3 bucket in the same region as the
     * conformance pack.
     * </p>
     * <note>
     * <p>
     * You must have access to read Amazon S3 bucket.
     * </p>
     * </note>
     * 
     * @param templateS3Uri
     *        Location of file containing the template body (<code>s3://bucketname/prefix</code>). The uri must point to
     *        the conformance pack template (max size: 300 KB) that is located in an Amazon S3 bucket in the same region
     *        as the conformance pack. </p> <note>
     *        <p>
     *        You must have access to read Amazon S3 bucket.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConformancePackRequest withTemplateS3Uri(String templateS3Uri) {
        setTemplateS3Uri(templateS3Uri);
        return this;
    }

    /**
     * <p>
     * A string containing full conformance pack template body. Structure containing the template body with a minimum
     * length of 1 byte and a maximum length of 51,200 bytes.
     * </p>
     * <note>
     * <p>
     * You can only use a YAML template with one resource type, that is, config rule and a remediation action.
     * </p>
     * </note>
     * 
     * @param templateBody
     *        A string containing full conformance pack template body. Structure containing the template body with a
     *        minimum length of 1 byte and a maximum length of 51,200 bytes.</p> <note>
     *        <p>
     *        You can only use a YAML template with one resource type, that is, config rule and a remediation action.
     *        </p>
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * A string containing full conformance pack template body. Structure containing the template body with a minimum
     * length of 1 byte and a maximum length of 51,200 bytes.
     * </p>
     * <note>
     * <p>
     * You can only use a YAML template with one resource type, that is, config rule and a remediation action.
     * </p>
     * </note>
     * 
     * @return A string containing full conformance pack template body. Structure containing the template body with a
     *         minimum length of 1 byte and a maximum length of 51,200 bytes.</p> <note>
     *         <p>
     *         You can only use a YAML template with one resource type, that is, config rule and a remediation action.
     *         </p>
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * A string containing full conformance pack template body. Structure containing the template body with a minimum
     * length of 1 byte and a maximum length of 51,200 bytes.
     * </p>
     * <note>
     * <p>
     * You can only use a YAML template with one resource type, that is, config rule and a remediation action.
     * </p>
     * </note>
     * 
     * @param templateBody
     *        A string containing full conformance pack template body. Structure containing the template body with a
     *        minimum length of 1 byte and a maximum length of 51,200 bytes.</p> <note>
     *        <p>
     *        You can only use a YAML template with one resource type, that is, config rule and a remediation action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConformancePackRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * AWS Config stores intermediate files while processing conformance pack template.
     * </p>
     * 
     * @param deliveryS3Bucket
     *        AWS Config stores intermediate files while processing conformance pack template.
     */

    public void setDeliveryS3Bucket(String deliveryS3Bucket) {
        this.deliveryS3Bucket = deliveryS3Bucket;
    }

    /**
     * <p>
     * AWS Config stores intermediate files while processing conformance pack template.
     * </p>
     * 
     * @return AWS Config stores intermediate files while processing conformance pack template.
     */

    public String getDeliveryS3Bucket() {
        return this.deliveryS3Bucket;
    }

    /**
     * <p>
     * AWS Config stores intermediate files while processing conformance pack template.
     * </p>
     * 
     * @param deliveryS3Bucket
     *        AWS Config stores intermediate files while processing conformance pack template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConformancePackRequest withDeliveryS3Bucket(String deliveryS3Bucket) {
        setDeliveryS3Bucket(deliveryS3Bucket);
        return this;
    }

    /**
     * <p>
     * The prefix for the Amazon S3 bucket.
     * </p>
     * 
     * @param deliveryS3KeyPrefix
     *        The prefix for the Amazon S3 bucket.
     */

    public void setDeliveryS3KeyPrefix(String deliveryS3KeyPrefix) {
        this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
    }

    /**
     * <p>
     * The prefix for the Amazon S3 bucket.
     * </p>
     * 
     * @return The prefix for the Amazon S3 bucket.
     */

    public String getDeliveryS3KeyPrefix() {
        return this.deliveryS3KeyPrefix;
    }

    /**
     * <p>
     * The prefix for the Amazon S3 bucket.
     * </p>
     * 
     * @param deliveryS3KeyPrefix
     *        The prefix for the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConformancePackRequest withDeliveryS3KeyPrefix(String deliveryS3KeyPrefix) {
        setDeliveryS3KeyPrefix(deliveryS3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     * 
     * @return A list of <code>ConformancePackInputParameter</code> objects.
     */

    public java.util.List<ConformancePackInputParameter> getConformancePackInputParameters() {
        if (conformancePackInputParameters == null) {
            conformancePackInputParameters = new com.amazonaws.internal.SdkInternalList<ConformancePackInputParameter>();
        }
        return conformancePackInputParameters;
    }

    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     * 
     * @param conformancePackInputParameters
     *        A list of <code>ConformancePackInputParameter</code> objects.
     */

    public void setConformancePackInputParameters(java.util.Collection<ConformancePackInputParameter> conformancePackInputParameters) {
        if (conformancePackInputParameters == null) {
            this.conformancePackInputParameters = null;
            return;
        }

        this.conformancePackInputParameters = new com.amazonaws.internal.SdkInternalList<ConformancePackInputParameter>(conformancePackInputParameters);
    }

    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConformancePackInputParameters(java.util.Collection)} or
     * {@link #withConformancePackInputParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param conformancePackInputParameters
     *        A list of <code>ConformancePackInputParameter</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConformancePackRequest withConformancePackInputParameters(ConformancePackInputParameter... conformancePackInputParameters) {
        if (this.conformancePackInputParameters == null) {
            setConformancePackInputParameters(new com.amazonaws.internal.SdkInternalList<ConformancePackInputParameter>(conformancePackInputParameters.length));
        }
        for (ConformancePackInputParameter ele : conformancePackInputParameters) {
            this.conformancePackInputParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     * 
     * @param conformancePackInputParameters
     *        A list of <code>ConformancePackInputParameter</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConformancePackRequest withConformancePackInputParameters(java.util.Collection<ConformancePackInputParameter> conformancePackInputParameters) {
        setConformancePackInputParameters(conformancePackInputParameters);
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
        if (getConformancePackName() != null)
            sb.append("ConformancePackName: ").append(getConformancePackName()).append(",");
        if (getTemplateS3Uri() != null)
            sb.append("TemplateS3Uri: ").append(getTemplateS3Uri()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getDeliveryS3Bucket() != null)
            sb.append("DeliveryS3Bucket: ").append(getDeliveryS3Bucket()).append(",");
        if (getDeliveryS3KeyPrefix() != null)
            sb.append("DeliveryS3KeyPrefix: ").append(getDeliveryS3KeyPrefix()).append(",");
        if (getConformancePackInputParameters() != null)
            sb.append("ConformancePackInputParameters: ").append(getConformancePackInputParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConformancePackRequest == false)
            return false;
        PutConformancePackRequest other = (PutConformancePackRequest) obj;
        if (other.getConformancePackName() == null ^ this.getConformancePackName() == null)
            return false;
        if (other.getConformancePackName() != null && other.getConformancePackName().equals(this.getConformancePackName()) == false)
            return false;
        if (other.getTemplateS3Uri() == null ^ this.getTemplateS3Uri() == null)
            return false;
        if (other.getTemplateS3Uri() != null && other.getTemplateS3Uri().equals(this.getTemplateS3Uri()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getDeliveryS3Bucket() == null ^ this.getDeliveryS3Bucket() == null)
            return false;
        if (other.getDeliveryS3Bucket() != null && other.getDeliveryS3Bucket().equals(this.getDeliveryS3Bucket()) == false)
            return false;
        if (other.getDeliveryS3KeyPrefix() == null ^ this.getDeliveryS3KeyPrefix() == null)
            return false;
        if (other.getDeliveryS3KeyPrefix() != null && other.getDeliveryS3KeyPrefix().equals(this.getDeliveryS3KeyPrefix()) == false)
            return false;
        if (other.getConformancePackInputParameters() == null ^ this.getConformancePackInputParameters() == null)
            return false;
        if (other.getConformancePackInputParameters() != null
                && other.getConformancePackInputParameters().equals(this.getConformancePackInputParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConformancePackName() == null) ? 0 : getConformancePackName().hashCode());
        hashCode = prime * hashCode + ((getTemplateS3Uri() == null) ? 0 : getTemplateS3Uri().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getDeliveryS3Bucket() == null) ? 0 : getDeliveryS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getDeliveryS3KeyPrefix() == null) ? 0 : getDeliveryS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getConformancePackInputParameters() == null) ? 0 : getConformancePackInputParameters().hashCode());
        return hashCode;
    }

    @Override
    public PutConformancePackRequest clone() {
        return (PutConformancePackRequest) super.clone();
    }

}
