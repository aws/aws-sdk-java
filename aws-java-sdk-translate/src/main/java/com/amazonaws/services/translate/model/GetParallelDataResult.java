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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/GetParallelData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParallelDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The properties of the parallel data resource that is being retrieved.
     * </p>
     */
    private ParallelDataProperties parallelDataProperties;
    /**
     * <p>
     * The location of the most recent parallel data input file that was successfully imported into Amazon Translate.
     * The location is returned as a presigned URL that has a 30 minute expiration.
     * </p>
     */
    private ParallelDataDataLocation dataLocation;
    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This
     * file was created when Amazon Translate attempted to create a parallel data resource. The location is returned as
     * a presigned URL to that has a 30 minute expiration.
     * </p>
     */
    private ParallelDataDataLocation auxiliaryDataLocation;
    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This
     * file was created when Amazon Translate attempted to update a parallel data resource. The location is returned as
     * a presigned URL to that has a 30 minute expiration.
     * </p>
     */
    private ParallelDataDataLocation latestUpdateAttemptAuxiliaryDataLocation;

    /**
     * <p>
     * The properties of the parallel data resource that is being retrieved.
     * </p>
     * 
     * @param parallelDataProperties
     *        The properties of the parallel data resource that is being retrieved.
     */

    public void setParallelDataProperties(ParallelDataProperties parallelDataProperties) {
        this.parallelDataProperties = parallelDataProperties;
    }

    /**
     * <p>
     * The properties of the parallel data resource that is being retrieved.
     * </p>
     * 
     * @return The properties of the parallel data resource that is being retrieved.
     */

    public ParallelDataProperties getParallelDataProperties() {
        return this.parallelDataProperties;
    }

    /**
     * <p>
     * The properties of the parallel data resource that is being retrieved.
     * </p>
     * 
     * @param parallelDataProperties
     *        The properties of the parallel data resource that is being retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParallelDataResult withParallelDataProperties(ParallelDataProperties parallelDataProperties) {
        setParallelDataProperties(parallelDataProperties);
        return this;
    }

    /**
     * <p>
     * The location of the most recent parallel data input file that was successfully imported into Amazon Translate.
     * The location is returned as a presigned URL that has a 30 minute expiration.
     * </p>
     * 
     * @param dataLocation
     *        The location of the most recent parallel data input file that was successfully imported into Amazon
     *        Translate. The location is returned as a presigned URL that has a 30 minute expiration.
     */

    public void setDataLocation(ParallelDataDataLocation dataLocation) {
        this.dataLocation = dataLocation;
    }

    /**
     * <p>
     * The location of the most recent parallel data input file that was successfully imported into Amazon Translate.
     * The location is returned as a presigned URL that has a 30 minute expiration.
     * </p>
     * 
     * @return The location of the most recent parallel data input file that was successfully imported into Amazon
     *         Translate. The location is returned as a presigned URL that has a 30 minute expiration.
     */

    public ParallelDataDataLocation getDataLocation() {
        return this.dataLocation;
    }

    /**
     * <p>
     * The location of the most recent parallel data input file that was successfully imported into Amazon Translate.
     * The location is returned as a presigned URL that has a 30 minute expiration.
     * </p>
     * 
     * @param dataLocation
     *        The location of the most recent parallel data input file that was successfully imported into Amazon
     *        Translate. The location is returned as a presigned URL that has a 30 minute expiration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParallelDataResult withDataLocation(ParallelDataDataLocation dataLocation) {
        setDataLocation(dataLocation);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This
     * file was created when Amazon Translate attempted to create a parallel data resource. The location is returned as
     * a presigned URL to that has a 30 minute expiration.
     * </p>
     * 
     * @param auxiliaryDataLocation
     *        The Amazon S3 location of a file that provides any errors or warnings that were produced by your input
     *        file. This file was created when Amazon Translate attempted to create a parallel data resource. The
     *        location is returned as a presigned URL to that has a 30 minute expiration.
     */

    public void setAuxiliaryDataLocation(ParallelDataDataLocation auxiliaryDataLocation) {
        this.auxiliaryDataLocation = auxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This
     * file was created when Amazon Translate attempted to create a parallel data resource. The location is returned as
     * a presigned URL to that has a 30 minute expiration.
     * </p>
     * 
     * @return The Amazon S3 location of a file that provides any errors or warnings that were produced by your input
     *         file. This file was created when Amazon Translate attempted to create a parallel data resource. The
     *         location is returned as a presigned URL to that has a 30 minute expiration.
     */

    public ParallelDataDataLocation getAuxiliaryDataLocation() {
        return this.auxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This
     * file was created when Amazon Translate attempted to create a parallel data resource. The location is returned as
     * a presigned URL to that has a 30 minute expiration.
     * </p>
     * 
     * @param auxiliaryDataLocation
     *        The Amazon S3 location of a file that provides any errors or warnings that were produced by your input
     *        file. This file was created when Amazon Translate attempted to create a parallel data resource. The
     *        location is returned as a presigned URL to that has a 30 minute expiration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParallelDataResult withAuxiliaryDataLocation(ParallelDataDataLocation auxiliaryDataLocation) {
        setAuxiliaryDataLocation(auxiliaryDataLocation);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This
     * file was created when Amazon Translate attempted to update a parallel data resource. The location is returned as
     * a presigned URL to that has a 30 minute expiration.
     * </p>
     * 
     * @param latestUpdateAttemptAuxiliaryDataLocation
     *        The Amazon S3 location of a file that provides any errors or warnings that were produced by your input
     *        file. This file was created when Amazon Translate attempted to update a parallel data resource. The
     *        location is returned as a presigned URL to that has a 30 minute expiration.
     */

    public void setLatestUpdateAttemptAuxiliaryDataLocation(ParallelDataDataLocation latestUpdateAttemptAuxiliaryDataLocation) {
        this.latestUpdateAttemptAuxiliaryDataLocation = latestUpdateAttemptAuxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This
     * file was created when Amazon Translate attempted to update a parallel data resource. The location is returned as
     * a presigned URL to that has a 30 minute expiration.
     * </p>
     * 
     * @return The Amazon S3 location of a file that provides any errors or warnings that were produced by your input
     *         file. This file was created when Amazon Translate attempted to update a parallel data resource. The
     *         location is returned as a presigned URL to that has a 30 minute expiration.
     */

    public ParallelDataDataLocation getLatestUpdateAttemptAuxiliaryDataLocation() {
        return this.latestUpdateAttemptAuxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings that were produced by your input file. This
     * file was created when Amazon Translate attempted to update a parallel data resource. The location is returned as
     * a presigned URL to that has a 30 minute expiration.
     * </p>
     * 
     * @param latestUpdateAttemptAuxiliaryDataLocation
     *        The Amazon S3 location of a file that provides any errors or warnings that were produced by your input
     *        file. This file was created when Amazon Translate attempted to update a parallel data resource. The
     *        location is returned as a presigned URL to that has a 30 minute expiration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParallelDataResult withLatestUpdateAttemptAuxiliaryDataLocation(ParallelDataDataLocation latestUpdateAttemptAuxiliaryDataLocation) {
        setLatestUpdateAttemptAuxiliaryDataLocation(latestUpdateAttemptAuxiliaryDataLocation);
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
        if (getParallelDataProperties() != null)
            sb.append("ParallelDataProperties: ").append(getParallelDataProperties()).append(",");
        if (getDataLocation() != null)
            sb.append("DataLocation: ").append(getDataLocation()).append(",");
        if (getAuxiliaryDataLocation() != null)
            sb.append("AuxiliaryDataLocation: ").append(getAuxiliaryDataLocation()).append(",");
        if (getLatestUpdateAttemptAuxiliaryDataLocation() != null)
            sb.append("LatestUpdateAttemptAuxiliaryDataLocation: ").append(getLatestUpdateAttemptAuxiliaryDataLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParallelDataResult == false)
            return false;
        GetParallelDataResult other = (GetParallelDataResult) obj;
        if (other.getParallelDataProperties() == null ^ this.getParallelDataProperties() == null)
            return false;
        if (other.getParallelDataProperties() != null && other.getParallelDataProperties().equals(this.getParallelDataProperties()) == false)
            return false;
        if (other.getDataLocation() == null ^ this.getDataLocation() == null)
            return false;
        if (other.getDataLocation() != null && other.getDataLocation().equals(this.getDataLocation()) == false)
            return false;
        if (other.getAuxiliaryDataLocation() == null ^ this.getAuxiliaryDataLocation() == null)
            return false;
        if (other.getAuxiliaryDataLocation() != null && other.getAuxiliaryDataLocation().equals(this.getAuxiliaryDataLocation()) == false)
            return false;
        if (other.getLatestUpdateAttemptAuxiliaryDataLocation() == null ^ this.getLatestUpdateAttemptAuxiliaryDataLocation() == null)
            return false;
        if (other.getLatestUpdateAttemptAuxiliaryDataLocation() != null
                && other.getLatestUpdateAttemptAuxiliaryDataLocation().equals(this.getLatestUpdateAttemptAuxiliaryDataLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParallelDataProperties() == null) ? 0 : getParallelDataProperties().hashCode());
        hashCode = prime * hashCode + ((getDataLocation() == null) ? 0 : getDataLocation().hashCode());
        hashCode = prime * hashCode + ((getAuxiliaryDataLocation() == null) ? 0 : getAuxiliaryDataLocation().hashCode());
        hashCode = prime * hashCode + ((getLatestUpdateAttemptAuxiliaryDataLocation() == null) ? 0 : getLatestUpdateAttemptAuxiliaryDataLocation().hashCode());
        return hashCode;
    }

    @Override
    public GetParallelDataResult clone() {
        try {
            return (GetParallelDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
