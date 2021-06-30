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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dataset to be updated.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     * </p>
     */
    private String format;

    private FormatOptions formatOptions;

    private Input input;
    /**
     * <p>
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     * </p>
     */
    private PathOptions pathOptions;

    /**
     * <p>
     * The name of the dataset to be updated.
     * </p>
     * 
     * @param name
     *        The name of the dataset to be updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the dataset to be updated.
     * </p>
     * 
     * @return The name of the dataset to be updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the dataset to be updated.
     * </p>
     * 
     * @param name
     *        The name of the dataset to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     * </p>
     * 
     * @param format
     *        The file format of a dataset that is created from an Amazon S3 file or folder.
     * @see InputFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     * </p>
     * 
     * @return The file format of a dataset that is created from an Amazon S3 file or folder.
     * @see InputFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     * </p>
     * 
     * @param format
     *        The file format of a dataset that is created from an Amazon S3 file or folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFormat
     */

    public UpdateDatasetRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     * </p>
     * 
     * @param format
     *        The file format of a dataset that is created from an Amazon S3 file or folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFormat
     */

    public UpdateDatasetRequest withFormat(InputFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * @param formatOptions
     */

    public void setFormatOptions(FormatOptions formatOptions) {
        this.formatOptions = formatOptions;
    }

    /**
     * @return
     */

    public FormatOptions getFormatOptions() {
        return this.formatOptions;
    }

    /**
     * @param formatOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withFormatOptions(FormatOptions formatOptions) {
        setFormatOptions(formatOptions);
        return this;
    }

    /**
     * @param input
     */

    public void setInput(Input input) {
        this.input = input;
    }

    /**
     * @return
     */

    public Input getInput() {
        return this.input;
    }

    /**
     * @param input
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withInput(Input input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     * </p>
     * 
     * @param pathOptions
     *        A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     */

    public void setPathOptions(PathOptions pathOptions) {
        this.pathOptions = pathOptions;
    }

    /**
     * <p>
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     * </p>
     * 
     * @return A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     */

    public PathOptions getPathOptions() {
        return this.pathOptions;
    }

    /**
     * <p>
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     * </p>
     * 
     * @param pathOptions
     *        A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetRequest withPathOptions(PathOptions pathOptions) {
        setPathOptions(pathOptions);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getFormatOptions() != null)
            sb.append("FormatOptions: ").append(getFormatOptions()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getPathOptions() != null)
            sb.append("PathOptions: ").append(getPathOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDatasetRequest == false)
            return false;
        UpdateDatasetRequest other = (UpdateDatasetRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getFormatOptions() == null ^ this.getFormatOptions() == null)
            return false;
        if (other.getFormatOptions() != null && other.getFormatOptions().equals(this.getFormatOptions()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getPathOptions() == null ^ this.getPathOptions() == null)
            return false;
        if (other.getPathOptions() != null && other.getPathOptions().equals(this.getPathOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getFormatOptions() == null) ? 0 : getFormatOptions().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getPathOptions() == null) ? 0 : getPathOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDatasetRequest clone() {
        return (UpdateDatasetRequest) super.clone();
    }

}
