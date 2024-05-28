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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/CreatePracticeRunConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePracticeRunConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you configured the practice run for.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the resource that you configured the practice run for.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A practice run configuration for a resource. Configurations include the outcome alarm that you specify for
     * practice runs, and, optionally, a blocking alarm and blocking dates and windows.
     * </p>
     */
    private PracticeRunConfiguration practiceRunConfiguration;
    /**
     * <p>
     * The status for zonal autoshift for a resource. When you specify the autoshift status as <code>ENABLED</code>,
     * Amazon Web Services shifts traffic away from shifts away application resource traffic from an Availability Zone,
     * on your behalf, when Amazon Web Services determines that there's an issue in the Availability Zone that could
     * potentially affect customers.
     * </p>
     * <p>
     * When you enable zonal autoshift, you must also configure practice runs for the resource.
     * </p>
     */
    private String zonalAutoshiftStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you configured the practice run for.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource that you configured the practice run for.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you configured the practice run for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource that you configured the practice run for.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you configured the practice run for.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the resource that you configured the practice run for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePracticeRunConfigurationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the resource that you configured the practice run for.
     * </p>
     * 
     * @param name
     *        The name of the resource that you configured the practice run for.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource that you configured the practice run for.
     * </p>
     * 
     * @return The name of the resource that you configured the practice run for.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource that you configured the practice run for.
     * </p>
     * 
     * @param name
     *        The name of the resource that you configured the practice run for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePracticeRunConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A practice run configuration for a resource. Configurations include the outcome alarm that you specify for
     * practice runs, and, optionally, a blocking alarm and blocking dates and windows.
     * </p>
     * 
     * @param practiceRunConfiguration
     *        A practice run configuration for a resource. Configurations include the outcome alarm that you specify for
     *        practice runs, and, optionally, a blocking alarm and blocking dates and windows.
     */

    public void setPracticeRunConfiguration(PracticeRunConfiguration practiceRunConfiguration) {
        this.practiceRunConfiguration = practiceRunConfiguration;
    }

    /**
     * <p>
     * A practice run configuration for a resource. Configurations include the outcome alarm that you specify for
     * practice runs, and, optionally, a blocking alarm and blocking dates and windows.
     * </p>
     * 
     * @return A practice run configuration for a resource. Configurations include the outcome alarm that you specify
     *         for practice runs, and, optionally, a blocking alarm and blocking dates and windows.
     */

    public PracticeRunConfiguration getPracticeRunConfiguration() {
        return this.practiceRunConfiguration;
    }

    /**
     * <p>
     * A practice run configuration for a resource. Configurations include the outcome alarm that you specify for
     * practice runs, and, optionally, a blocking alarm and blocking dates and windows.
     * </p>
     * 
     * @param practiceRunConfiguration
     *        A practice run configuration for a resource. Configurations include the outcome alarm that you specify for
     *        practice runs, and, optionally, a blocking alarm and blocking dates and windows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePracticeRunConfigurationResult withPracticeRunConfiguration(PracticeRunConfiguration practiceRunConfiguration) {
        setPracticeRunConfiguration(practiceRunConfiguration);
        return this;
    }

    /**
     * <p>
     * The status for zonal autoshift for a resource. When you specify the autoshift status as <code>ENABLED</code>,
     * Amazon Web Services shifts traffic away from shifts away application resource traffic from an Availability Zone,
     * on your behalf, when Amazon Web Services determines that there's an issue in the Availability Zone that could
     * potentially affect customers.
     * </p>
     * <p>
     * When you enable zonal autoshift, you must also configure practice runs for the resource.
     * </p>
     * 
     * @param zonalAutoshiftStatus
     *        The status for zonal autoshift for a resource. When you specify the autoshift status as
     *        <code>ENABLED</code>, Amazon Web Services shifts traffic away from shifts away application resource
     *        traffic from an Availability Zone, on your behalf, when Amazon Web Services determines that there's an
     *        issue in the Availability Zone that could potentially affect customers.</p>
     *        <p>
     *        When you enable zonal autoshift, you must also configure practice runs for the resource.
     * @see ZonalAutoshiftStatus
     */

    public void setZonalAutoshiftStatus(String zonalAutoshiftStatus) {
        this.zonalAutoshiftStatus = zonalAutoshiftStatus;
    }

    /**
     * <p>
     * The status for zonal autoshift for a resource. When you specify the autoshift status as <code>ENABLED</code>,
     * Amazon Web Services shifts traffic away from shifts away application resource traffic from an Availability Zone,
     * on your behalf, when Amazon Web Services determines that there's an issue in the Availability Zone that could
     * potentially affect customers.
     * </p>
     * <p>
     * When you enable zonal autoshift, you must also configure practice runs for the resource.
     * </p>
     * 
     * @return The status for zonal autoshift for a resource. When you specify the autoshift status as
     *         <code>ENABLED</code>, Amazon Web Services shifts traffic away from shifts away application resource
     *         traffic from an Availability Zone, on your behalf, when Amazon Web Services determines that there's an
     *         issue in the Availability Zone that could potentially affect customers.</p>
     *         <p>
     *         When you enable zonal autoshift, you must also configure practice runs for the resource.
     * @see ZonalAutoshiftStatus
     */

    public String getZonalAutoshiftStatus() {
        return this.zonalAutoshiftStatus;
    }

    /**
     * <p>
     * The status for zonal autoshift for a resource. When you specify the autoshift status as <code>ENABLED</code>,
     * Amazon Web Services shifts traffic away from shifts away application resource traffic from an Availability Zone,
     * on your behalf, when Amazon Web Services determines that there's an issue in the Availability Zone that could
     * potentially affect customers.
     * </p>
     * <p>
     * When you enable zonal autoshift, you must also configure practice runs for the resource.
     * </p>
     * 
     * @param zonalAutoshiftStatus
     *        The status for zonal autoshift for a resource. When you specify the autoshift status as
     *        <code>ENABLED</code>, Amazon Web Services shifts traffic away from shifts away application resource
     *        traffic from an Availability Zone, on your behalf, when Amazon Web Services determines that there's an
     *        issue in the Availability Zone that could potentially affect customers.</p>
     *        <p>
     *        When you enable zonal autoshift, you must also configure practice runs for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalAutoshiftStatus
     */

    public CreatePracticeRunConfigurationResult withZonalAutoshiftStatus(String zonalAutoshiftStatus) {
        setZonalAutoshiftStatus(zonalAutoshiftStatus);
        return this;
    }

    /**
     * <p>
     * The status for zonal autoshift for a resource. When you specify the autoshift status as <code>ENABLED</code>,
     * Amazon Web Services shifts traffic away from shifts away application resource traffic from an Availability Zone,
     * on your behalf, when Amazon Web Services determines that there's an issue in the Availability Zone that could
     * potentially affect customers.
     * </p>
     * <p>
     * When you enable zonal autoshift, you must also configure practice runs for the resource.
     * </p>
     * 
     * @param zonalAutoshiftStatus
     *        The status for zonal autoshift for a resource. When you specify the autoshift status as
     *        <code>ENABLED</code>, Amazon Web Services shifts traffic away from shifts away application resource
     *        traffic from an Availability Zone, on your behalf, when Amazon Web Services determines that there's an
     *        issue in the Availability Zone that could potentially affect customers.</p>
     *        <p>
     *        When you enable zonal autoshift, you must also configure practice runs for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZonalAutoshiftStatus
     */

    public CreatePracticeRunConfigurationResult withZonalAutoshiftStatus(ZonalAutoshiftStatus zonalAutoshiftStatus) {
        this.zonalAutoshiftStatus = zonalAutoshiftStatus.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPracticeRunConfiguration() != null)
            sb.append("PracticeRunConfiguration: ").append(getPracticeRunConfiguration()).append(",");
        if (getZonalAutoshiftStatus() != null)
            sb.append("ZonalAutoshiftStatus: ").append(getZonalAutoshiftStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePracticeRunConfigurationResult == false)
            return false;
        CreatePracticeRunConfigurationResult other = (CreatePracticeRunConfigurationResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPracticeRunConfiguration() == null ^ this.getPracticeRunConfiguration() == null)
            return false;
        if (other.getPracticeRunConfiguration() != null && other.getPracticeRunConfiguration().equals(this.getPracticeRunConfiguration()) == false)
            return false;
        if (other.getZonalAutoshiftStatus() == null ^ this.getZonalAutoshiftStatus() == null)
            return false;
        if (other.getZonalAutoshiftStatus() != null && other.getZonalAutoshiftStatus().equals(this.getZonalAutoshiftStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPracticeRunConfiguration() == null) ? 0 : getPracticeRunConfiguration().hashCode());
        hashCode = prime * hashCode + ((getZonalAutoshiftStatus() == null) ? 0 : getZonalAutoshiftStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreatePracticeRunConfigurationResult clone() {
        try {
            return (CreatePracticeRunConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
