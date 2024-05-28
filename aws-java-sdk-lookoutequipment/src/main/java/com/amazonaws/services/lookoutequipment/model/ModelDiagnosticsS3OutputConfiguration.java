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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon S3 location for the pointwise model diagnostics for an Amazon Lookout for Equipment model.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/ModelDiagnosticsS3OutputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDiagnosticsS3OutputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket where the pointwise model diagnostics are located. You must be the owner of the
     * Amazon S3 bucket.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The Amazon S3 prefix for the location of the pointwise model diagnostics. The prefix specifies the folder and
     * evaluation result file name. (<code>bucket</code>).
     * </p>
     * <p>
     * When you call <code>CreateModel</code> or <code>UpdateModel</code>, specify the path within the bucket that you
     * want Lookout for Equipment to save the model to. During training, Lookout for Equipment creates the model
     * evaluation model as a compressed JSON file with the name <code>model_diagnostics_results.json.gz</code>.
     * </p>
     * <p>
     * When you call <code>DescribeModel</code> or <code>DescribeModelVersion</code>, <code>prefix</code> contains the
     * file path and filename of the model evaluation file.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The name of the Amazon S3 bucket where the pointwise model diagnostics are located. You must be the owner of the
     * Amazon S3 bucket.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket where the pointwise model diagnostics are located. You must be the owner
     *        of the Amazon S3 bucket.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the pointwise model diagnostics are located. You must be the owner of the
     * Amazon S3 bucket.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket where the pointwise model diagnostics are located. You must be the owner
     *         of the Amazon S3 bucket.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket where the pointwise model diagnostics are located. You must be the owner of the
     * Amazon S3 bucket.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket where the pointwise model diagnostics are located. You must be the owner
     *        of the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDiagnosticsS3OutputConfiguration withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 prefix for the location of the pointwise model diagnostics. The prefix specifies the folder and
     * evaluation result file name. (<code>bucket</code>).
     * </p>
     * <p>
     * When you call <code>CreateModel</code> or <code>UpdateModel</code>, specify the path within the bucket that you
     * want Lookout for Equipment to save the model to. During training, Lookout for Equipment creates the model
     * evaluation model as a compressed JSON file with the name <code>model_diagnostics_results.json.gz</code>.
     * </p>
     * <p>
     * When you call <code>DescribeModel</code> or <code>DescribeModelVersion</code>, <code>prefix</code> contains the
     * file path and filename of the model evaluation file.
     * </p>
     * 
     * @param prefix
     *        The Amazon S3 prefix for the location of the pointwise model diagnostics. The prefix specifies the folder
     *        and evaluation result file name. (<code>bucket</code>).</p>
     *        <p>
     *        When you call <code>CreateModel</code> or <code>UpdateModel</code>, specify the path within the bucket
     *        that you want Lookout for Equipment to save the model to. During training, Lookout for Equipment creates
     *        the model evaluation model as a compressed JSON file with the name
     *        <code>model_diagnostics_results.json.gz</code>.
     *        </p>
     *        <p>
     *        When you call <code>DescribeModel</code> or <code>DescribeModelVersion</code>, <code>prefix</code>
     *        contains the file path and filename of the model evaluation file.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The Amazon S3 prefix for the location of the pointwise model diagnostics. The prefix specifies the folder and
     * evaluation result file name. (<code>bucket</code>).
     * </p>
     * <p>
     * When you call <code>CreateModel</code> or <code>UpdateModel</code>, specify the path within the bucket that you
     * want Lookout for Equipment to save the model to. During training, Lookout for Equipment creates the model
     * evaluation model as a compressed JSON file with the name <code>model_diagnostics_results.json.gz</code>.
     * </p>
     * <p>
     * When you call <code>DescribeModel</code> or <code>DescribeModelVersion</code>, <code>prefix</code> contains the
     * file path and filename of the model evaluation file.
     * </p>
     * 
     * @return The Amazon S3 prefix for the location of the pointwise model diagnostics. The prefix specifies the folder
     *         and evaluation result file name. (<code>bucket</code>).</p>
     *         <p>
     *         When you call <code>CreateModel</code> or <code>UpdateModel</code>, specify the path within the bucket
     *         that you want Lookout for Equipment to save the model to. During training, Lookout for Equipment creates
     *         the model evaluation model as a compressed JSON file with the name
     *         <code>model_diagnostics_results.json.gz</code>.
     *         </p>
     *         <p>
     *         When you call <code>DescribeModel</code> or <code>DescribeModelVersion</code>, <code>prefix</code>
     *         contains the file path and filename of the model evaluation file.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The Amazon S3 prefix for the location of the pointwise model diagnostics. The prefix specifies the folder and
     * evaluation result file name. (<code>bucket</code>).
     * </p>
     * <p>
     * When you call <code>CreateModel</code> or <code>UpdateModel</code>, specify the path within the bucket that you
     * want Lookout for Equipment to save the model to. During training, Lookout for Equipment creates the model
     * evaluation model as a compressed JSON file with the name <code>model_diagnostics_results.json.gz</code>.
     * </p>
     * <p>
     * When you call <code>DescribeModel</code> or <code>DescribeModelVersion</code>, <code>prefix</code> contains the
     * file path and filename of the model evaluation file.
     * </p>
     * 
     * @param prefix
     *        The Amazon S3 prefix for the location of the pointwise model diagnostics. The prefix specifies the folder
     *        and evaluation result file name. (<code>bucket</code>).</p>
     *        <p>
     *        When you call <code>CreateModel</code> or <code>UpdateModel</code>, specify the path within the bucket
     *        that you want Lookout for Equipment to save the model to. During training, Lookout for Equipment creates
     *        the model evaluation model as a compressed JSON file with the name
     *        <code>model_diagnostics_results.json.gz</code>.
     *        </p>
     *        <p>
     *        When you call <code>DescribeModel</code> or <code>DescribeModelVersion</code>, <code>prefix</code>
     *        contains the file path and filename of the model evaluation file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDiagnosticsS3OutputConfiguration withPrefix(String prefix) {
        setPrefix(prefix);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelDiagnosticsS3OutputConfiguration == false)
            return false;
        ModelDiagnosticsS3OutputConfiguration other = (ModelDiagnosticsS3OutputConfiguration) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public ModelDiagnosticsS3OutputConfiguration clone() {
        try {
            return (ModelDiagnosticsS3OutputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.ModelDiagnosticsS3OutputConfigurationMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
