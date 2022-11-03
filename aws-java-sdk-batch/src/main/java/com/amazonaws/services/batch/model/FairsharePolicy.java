/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The fair share policy for a scheduling policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/FairsharePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FairsharePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of time (in seconds) to use to calculate a fair share percentage for each fair share identifier in
     * use. A value of zero (0) indicates that only current usage is measured. The decay allows for more recently run
     * jobs to have more weight than jobs that ran earlier. The maximum supported value is 604800 (1 week).
     * </p>
     */
    private Integer shareDecaySeconds;
    /**
     * <p>
     * A value used to reserve some of the available maximum vCPU for fair share identifiers that aren't already used.
     * </p>
     * <p>
     * The reserved ratio is <code>(<i>computeReservation</i>/100)^<i>ActiveFairShares</i> </code> where
     * <code> <i>ActiveFairShares</i> </code> is the number of active fair share identifiers.
     * </p>
     * <p>
     * For example, a <code>computeReservation</code> value of 50 indicates that Batchreserves 50% of the maximum
     * available vCPU if there's only one fair share identifier. It reserves 25% if there are two fair share
     * identifiers. It reserves 12.5% if there are three fair share identifiers. A <code>computeReservation</code> value
     * of 25 indicates that Batch should reserve 25% of the maximum available vCPU if there's only one fair share
     * identifier, 6.25% if there are two fair share identifiers, and 1.56% if there are three fair share identifiers.
     * </p>
     * <p>
     * The minimum value is 0 and the maximum value is 99.
     * </p>
     */
    private Integer computeReservation;
    /**
     * <p>
     * An array of <code>SharedIdentifier</code> objects that contain the weights for the fair share identifiers for the
     * fair share policy. Fair share identifiers that aren't included have a default weight of <code>1.0</code>.
     * </p>
     */
    private java.util.List<ShareAttributes> shareDistribution;

    /**
     * <p>
     * The amount of time (in seconds) to use to calculate a fair share percentage for each fair share identifier in
     * use. A value of zero (0) indicates that only current usage is measured. The decay allows for more recently run
     * jobs to have more weight than jobs that ran earlier. The maximum supported value is 604800 (1 week).
     * </p>
     * 
     * @param shareDecaySeconds
     *        The amount of time (in seconds) to use to calculate a fair share percentage for each fair share identifier
     *        in use. A value of zero (0) indicates that only current usage is measured. The decay allows for more
     *        recently run jobs to have more weight than jobs that ran earlier. The maximum supported value is 604800 (1
     *        week).
     */

    public void setShareDecaySeconds(Integer shareDecaySeconds) {
        this.shareDecaySeconds = shareDecaySeconds;
    }

    /**
     * <p>
     * The amount of time (in seconds) to use to calculate a fair share percentage for each fair share identifier in
     * use. A value of zero (0) indicates that only current usage is measured. The decay allows for more recently run
     * jobs to have more weight than jobs that ran earlier. The maximum supported value is 604800 (1 week).
     * </p>
     * 
     * @return The amount of time (in seconds) to use to calculate a fair share percentage for each fair share
     *         identifier in use. A value of zero (0) indicates that only current usage is measured. The decay allows
     *         for more recently run jobs to have more weight than jobs that ran earlier. The maximum supported value is
     *         604800 (1 week).
     */

    public Integer getShareDecaySeconds() {
        return this.shareDecaySeconds;
    }

    /**
     * <p>
     * The amount of time (in seconds) to use to calculate a fair share percentage for each fair share identifier in
     * use. A value of zero (0) indicates that only current usage is measured. The decay allows for more recently run
     * jobs to have more weight than jobs that ran earlier. The maximum supported value is 604800 (1 week).
     * </p>
     * 
     * @param shareDecaySeconds
     *        The amount of time (in seconds) to use to calculate a fair share percentage for each fair share identifier
     *        in use. A value of zero (0) indicates that only current usage is measured. The decay allows for more
     *        recently run jobs to have more weight than jobs that ran earlier. The maximum supported value is 604800 (1
     *        week).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FairsharePolicy withShareDecaySeconds(Integer shareDecaySeconds) {
        setShareDecaySeconds(shareDecaySeconds);
        return this;
    }

    /**
     * <p>
     * A value used to reserve some of the available maximum vCPU for fair share identifiers that aren't already used.
     * </p>
     * <p>
     * The reserved ratio is <code>(<i>computeReservation</i>/100)^<i>ActiveFairShares</i> </code> where
     * <code> <i>ActiveFairShares</i> </code> is the number of active fair share identifiers.
     * </p>
     * <p>
     * For example, a <code>computeReservation</code> value of 50 indicates that Batchreserves 50% of the maximum
     * available vCPU if there's only one fair share identifier. It reserves 25% if there are two fair share
     * identifiers. It reserves 12.5% if there are three fair share identifiers. A <code>computeReservation</code> value
     * of 25 indicates that Batch should reserve 25% of the maximum available vCPU if there's only one fair share
     * identifier, 6.25% if there are two fair share identifiers, and 1.56% if there are three fair share identifiers.
     * </p>
     * <p>
     * The minimum value is 0 and the maximum value is 99.
     * </p>
     * 
     * @param computeReservation
     *        A value used to reserve some of the available maximum vCPU for fair share identifiers that aren't already
     *        used.</p>
     *        <p>
     *        The reserved ratio is <code>(<i>computeReservation</i>/100)^<i>ActiveFairShares</i> </code> where
     *        <code> <i>ActiveFairShares</i> </code> is the number of active fair share identifiers.
     *        </p>
     *        <p>
     *        For example, a <code>computeReservation</code> value of 50 indicates that Batchreserves 50% of the maximum
     *        available vCPU if there's only one fair share identifier. It reserves 25% if there are two fair share
     *        identifiers. It reserves 12.5% if there are three fair share identifiers. A
     *        <code>computeReservation</code> value of 25 indicates that Batch should reserve 25% of the maximum
     *        available vCPU if there's only one fair share identifier, 6.25% if there are two fair share identifiers,
     *        and 1.56% if there are three fair share identifiers.
     *        </p>
     *        <p>
     *        The minimum value is 0 and the maximum value is 99.
     */

    public void setComputeReservation(Integer computeReservation) {
        this.computeReservation = computeReservation;
    }

    /**
     * <p>
     * A value used to reserve some of the available maximum vCPU for fair share identifiers that aren't already used.
     * </p>
     * <p>
     * The reserved ratio is <code>(<i>computeReservation</i>/100)^<i>ActiveFairShares</i> </code> where
     * <code> <i>ActiveFairShares</i> </code> is the number of active fair share identifiers.
     * </p>
     * <p>
     * For example, a <code>computeReservation</code> value of 50 indicates that Batchreserves 50% of the maximum
     * available vCPU if there's only one fair share identifier. It reserves 25% if there are two fair share
     * identifiers. It reserves 12.5% if there are three fair share identifiers. A <code>computeReservation</code> value
     * of 25 indicates that Batch should reserve 25% of the maximum available vCPU if there's only one fair share
     * identifier, 6.25% if there are two fair share identifiers, and 1.56% if there are three fair share identifiers.
     * </p>
     * <p>
     * The minimum value is 0 and the maximum value is 99.
     * </p>
     * 
     * @return A value used to reserve some of the available maximum vCPU for fair share identifiers that aren't already
     *         used.</p>
     *         <p>
     *         The reserved ratio is <code>(<i>computeReservation</i>/100)^<i>ActiveFairShares</i> </code> where
     *         <code> <i>ActiveFairShares</i> </code> is the number of active fair share identifiers.
     *         </p>
     *         <p>
     *         For example, a <code>computeReservation</code> value of 50 indicates that Batchreserves 50% of the
     *         maximum available vCPU if there's only one fair share identifier. It reserves 25% if there are two fair
     *         share identifiers. It reserves 12.5% if there are three fair share identifiers. A
     *         <code>computeReservation</code> value of 25 indicates that Batch should reserve 25% of the maximum
     *         available vCPU if there's only one fair share identifier, 6.25% if there are two fair share identifiers,
     *         and 1.56% if there are three fair share identifiers.
     *         </p>
     *         <p>
     *         The minimum value is 0 and the maximum value is 99.
     */

    public Integer getComputeReservation() {
        return this.computeReservation;
    }

    /**
     * <p>
     * A value used to reserve some of the available maximum vCPU for fair share identifiers that aren't already used.
     * </p>
     * <p>
     * The reserved ratio is <code>(<i>computeReservation</i>/100)^<i>ActiveFairShares</i> </code> where
     * <code> <i>ActiveFairShares</i> </code> is the number of active fair share identifiers.
     * </p>
     * <p>
     * For example, a <code>computeReservation</code> value of 50 indicates that Batchreserves 50% of the maximum
     * available vCPU if there's only one fair share identifier. It reserves 25% if there are two fair share
     * identifiers. It reserves 12.5% if there are three fair share identifiers. A <code>computeReservation</code> value
     * of 25 indicates that Batch should reserve 25% of the maximum available vCPU if there's only one fair share
     * identifier, 6.25% if there are two fair share identifiers, and 1.56% if there are three fair share identifiers.
     * </p>
     * <p>
     * The minimum value is 0 and the maximum value is 99.
     * </p>
     * 
     * @param computeReservation
     *        A value used to reserve some of the available maximum vCPU for fair share identifiers that aren't already
     *        used.</p>
     *        <p>
     *        The reserved ratio is <code>(<i>computeReservation</i>/100)^<i>ActiveFairShares</i> </code> where
     *        <code> <i>ActiveFairShares</i> </code> is the number of active fair share identifiers.
     *        </p>
     *        <p>
     *        For example, a <code>computeReservation</code> value of 50 indicates that Batchreserves 50% of the maximum
     *        available vCPU if there's only one fair share identifier. It reserves 25% if there are two fair share
     *        identifiers. It reserves 12.5% if there are three fair share identifiers. A
     *        <code>computeReservation</code> value of 25 indicates that Batch should reserve 25% of the maximum
     *        available vCPU if there's only one fair share identifier, 6.25% if there are two fair share identifiers,
     *        and 1.56% if there are three fair share identifiers.
     *        </p>
     *        <p>
     *        The minimum value is 0 and the maximum value is 99.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FairsharePolicy withComputeReservation(Integer computeReservation) {
        setComputeReservation(computeReservation);
        return this;
    }

    /**
     * <p>
     * An array of <code>SharedIdentifier</code> objects that contain the weights for the fair share identifiers for the
     * fair share policy. Fair share identifiers that aren't included have a default weight of <code>1.0</code>.
     * </p>
     * 
     * @return An array of <code>SharedIdentifier</code> objects that contain the weights for the fair share identifiers
     *         for the fair share policy. Fair share identifiers that aren't included have a default weight of
     *         <code>1.0</code>.
     */

    public java.util.List<ShareAttributes> getShareDistribution() {
        return shareDistribution;
    }

    /**
     * <p>
     * An array of <code>SharedIdentifier</code> objects that contain the weights for the fair share identifiers for the
     * fair share policy. Fair share identifiers that aren't included have a default weight of <code>1.0</code>.
     * </p>
     * 
     * @param shareDistribution
     *        An array of <code>SharedIdentifier</code> objects that contain the weights for the fair share identifiers
     *        for the fair share policy. Fair share identifiers that aren't included have a default weight of
     *        <code>1.0</code>.
     */

    public void setShareDistribution(java.util.Collection<ShareAttributes> shareDistribution) {
        if (shareDistribution == null) {
            this.shareDistribution = null;
            return;
        }

        this.shareDistribution = new java.util.ArrayList<ShareAttributes>(shareDistribution);
    }

    /**
     * <p>
     * An array of <code>SharedIdentifier</code> objects that contain the weights for the fair share identifiers for the
     * fair share policy. Fair share identifiers that aren't included have a default weight of <code>1.0</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShareDistribution(java.util.Collection)} or {@link #withShareDistribution(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param shareDistribution
     *        An array of <code>SharedIdentifier</code> objects that contain the weights for the fair share identifiers
     *        for the fair share policy. Fair share identifiers that aren't included have a default weight of
     *        <code>1.0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FairsharePolicy withShareDistribution(ShareAttributes... shareDistribution) {
        if (this.shareDistribution == null) {
            setShareDistribution(new java.util.ArrayList<ShareAttributes>(shareDistribution.length));
        }
        for (ShareAttributes ele : shareDistribution) {
            this.shareDistribution.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>SharedIdentifier</code> objects that contain the weights for the fair share identifiers for the
     * fair share policy. Fair share identifiers that aren't included have a default weight of <code>1.0</code>.
     * </p>
     * 
     * @param shareDistribution
     *        An array of <code>SharedIdentifier</code> objects that contain the weights for the fair share identifiers
     *        for the fair share policy. Fair share identifiers that aren't included have a default weight of
     *        <code>1.0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FairsharePolicy withShareDistribution(java.util.Collection<ShareAttributes> shareDistribution) {
        setShareDistribution(shareDistribution);
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
        if (getShareDecaySeconds() != null)
            sb.append("ShareDecaySeconds: ").append(getShareDecaySeconds()).append(",");
        if (getComputeReservation() != null)
            sb.append("ComputeReservation: ").append(getComputeReservation()).append(",");
        if (getShareDistribution() != null)
            sb.append("ShareDistribution: ").append(getShareDistribution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FairsharePolicy == false)
            return false;
        FairsharePolicy other = (FairsharePolicy) obj;
        if (other.getShareDecaySeconds() == null ^ this.getShareDecaySeconds() == null)
            return false;
        if (other.getShareDecaySeconds() != null && other.getShareDecaySeconds().equals(this.getShareDecaySeconds()) == false)
            return false;
        if (other.getComputeReservation() == null ^ this.getComputeReservation() == null)
            return false;
        if (other.getComputeReservation() != null && other.getComputeReservation().equals(this.getComputeReservation()) == false)
            return false;
        if (other.getShareDistribution() == null ^ this.getShareDistribution() == null)
            return false;
        if (other.getShareDistribution() != null && other.getShareDistribution().equals(this.getShareDistribution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShareDecaySeconds() == null) ? 0 : getShareDecaySeconds().hashCode());
        hashCode = prime * hashCode + ((getComputeReservation() == null) ? 0 : getComputeReservation().hashCode());
        hashCode = prime * hashCode + ((getShareDistribution() == null) ? 0 : getShareDistribution().hashCode());
        return hashCode;
    }

    @Override
    public FairsharePolicy clone() {
        try {
            return (FairsharePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.FairsharePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
