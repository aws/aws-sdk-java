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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/StartTransformerJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTransformerJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the location of the input file for the transformation. The location consists of an Amazon S3 bucket and
     * prefix.
     * </p>
     */
    private S3Location inputFile;
    /**
     * <p>
     * Specifies the location of the output file for the transformation. The location consists of an Amazon S3 bucket
     * and prefix.
     * </p>
     */
    private S3Location outputLocation;
    /**
     * <p>
     * Specifies the system-assigned unique identifier for the transformer.
     * </p>
     */
    private String transformerId;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Specifies the location of the input file for the transformation. The location consists of an Amazon S3 bucket and
     * prefix.
     * </p>
     * 
     * @param inputFile
     *        Specifies the location of the input file for the transformation. The location consists of an Amazon S3
     *        bucket and prefix.
     */

    public void setInputFile(S3Location inputFile) {
        this.inputFile = inputFile;
    }

    /**
     * <p>
     * Specifies the location of the input file for the transformation. The location consists of an Amazon S3 bucket and
     * prefix.
     * </p>
     * 
     * @return Specifies the location of the input file for the transformation. The location consists of an Amazon S3
     *         bucket and prefix.
     */

    public S3Location getInputFile() {
        return this.inputFile;
    }

    /**
     * <p>
     * Specifies the location of the input file for the transformation. The location consists of an Amazon S3 bucket and
     * prefix.
     * </p>
     * 
     * @param inputFile
     *        Specifies the location of the input file for the transformation. The location consists of an Amazon S3
     *        bucket and prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTransformerJobRequest withInputFile(S3Location inputFile) {
        setInputFile(inputFile);
        return this;
    }

    /**
     * <p>
     * Specifies the location of the output file for the transformation. The location consists of an Amazon S3 bucket
     * and prefix.
     * </p>
     * 
     * @param outputLocation
     *        Specifies the location of the output file for the transformation. The location consists of an Amazon S3
     *        bucket and prefix.
     */

    public void setOutputLocation(S3Location outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * Specifies the location of the output file for the transformation. The location consists of an Amazon S3 bucket
     * and prefix.
     * </p>
     * 
     * @return Specifies the location of the output file for the transformation. The location consists of an Amazon S3
     *         bucket and prefix.
     */

    public S3Location getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * Specifies the location of the output file for the transformation. The location consists of an Amazon S3 bucket
     * and prefix.
     * </p>
     * 
     * @param outputLocation
     *        Specifies the location of the output file for the transformation. The location consists of an Amazon S3
     *        bucket and prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTransformerJobRequest withOutputLocation(S3Location outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * Specifies the system-assigned unique identifier for the transformer.
     * </p>
     * 
     * @param transformerId
     *        Specifies the system-assigned unique identifier for the transformer.
     */

    public void setTransformerId(String transformerId) {
        this.transformerId = transformerId;
    }

    /**
     * <p>
     * Specifies the system-assigned unique identifier for the transformer.
     * </p>
     * 
     * @return Specifies the system-assigned unique identifier for the transformer.
     */

    public String getTransformerId() {
        return this.transformerId;
    }

    /**
     * <p>
     * Specifies the system-assigned unique identifier for the transformer.
     * </p>
     * 
     * @param transformerId
     *        Specifies the system-assigned unique identifier for the transformer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTransformerJobRequest withTransformerId(String transformerId) {
        setTransformerId(transformerId);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param clientToken
     *        Reserved for future use.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param clientToken
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTransformerJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getInputFile() != null)
            sb.append("InputFile: ").append(getInputFile()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getTransformerId() != null)
            sb.append("TransformerId: ").append(getTransformerId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTransformerJobRequest == false)
            return false;
        StartTransformerJobRequest other = (StartTransformerJobRequest) obj;
        if (other.getInputFile() == null ^ this.getInputFile() == null)
            return false;
        if (other.getInputFile() != null && other.getInputFile().equals(this.getInputFile()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getTransformerId() == null ^ this.getTransformerId() == null)
            return false;
        if (other.getTransformerId() != null && other.getTransformerId().equals(this.getTransformerId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputFile() == null) ? 0 : getInputFile().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getTransformerId() == null) ? 0 : getTransformerId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public StartTransformerJobRequest clone() {
        return (StartTransformerJobRequest) super.clone();
    }

}
