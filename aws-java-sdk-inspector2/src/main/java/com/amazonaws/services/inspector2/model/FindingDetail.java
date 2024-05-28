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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the vulnerability identified in a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/FindingDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingDetail implements Serializable, Cloneable, StructuredPojo {

    private CisaData cisaData;
    /**
     * <p>
     * The Common Weakness Enumerations (CWEs) associated with the vulnerability.
     * </p>
     */
    private java.util.List<String> cwes;
    /**
     * <p>
     * The Exploit Prediction Scoring System (EPSS) score of the vulnerability.
     * </p>
     */
    private Double epssScore;
    /**
     * <p>
     * Information on the evidence of the vulnerability.
     * </p>
     */
    private java.util.List<Evidence> evidences;

    private ExploitObserved exploitObserved;
    /**
     * <p>
     * The finding ARN that the vulnerability details are associated with.
     * </p>
     */
    private String findingArn;
    /**
     * <p>
     * The reference URLs for the vulnerability data.
     * </p>
     */
    private java.util.List<String> referenceUrls;
    /**
     * <p>
     * The risk score of the vulnerability.
     * </p>
     */
    private Integer riskScore;
    /**
     * <p>
     * The known malware tools or kits that can exploit the vulnerability.
     * </p>
     */
    private java.util.List<String> tools;
    /**
     * <p>
     * The MITRE adversary tactics, techniques, or procedures (TTPs) associated with the vulnerability.
     * </p>
     */
    private java.util.List<String> ttps;

    /**
     * @param cisaData
     */

    public void setCisaData(CisaData cisaData) {
        this.cisaData = cisaData;
    }

    /**
     * @return
     */

    public CisaData getCisaData() {
        return this.cisaData;
    }

    /**
     * @param cisaData
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withCisaData(CisaData cisaData) {
        setCisaData(cisaData);
        return this;
    }

    /**
     * <p>
     * The Common Weakness Enumerations (CWEs) associated with the vulnerability.
     * </p>
     * 
     * @return The Common Weakness Enumerations (CWEs) associated with the vulnerability.
     */

    public java.util.List<String> getCwes() {
        return cwes;
    }

    /**
     * <p>
     * The Common Weakness Enumerations (CWEs) associated with the vulnerability.
     * </p>
     * 
     * @param cwes
     *        The Common Weakness Enumerations (CWEs) associated with the vulnerability.
     */

    public void setCwes(java.util.Collection<String> cwes) {
        if (cwes == null) {
            this.cwes = null;
            return;
        }

        this.cwes = new java.util.ArrayList<String>(cwes);
    }

    /**
     * <p>
     * The Common Weakness Enumerations (CWEs) associated with the vulnerability.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCwes(java.util.Collection)} or {@link #withCwes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cwes
     *        The Common Weakness Enumerations (CWEs) associated with the vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withCwes(String... cwes) {
        if (this.cwes == null) {
            setCwes(new java.util.ArrayList<String>(cwes.length));
        }
        for (String ele : cwes) {
            this.cwes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Common Weakness Enumerations (CWEs) associated with the vulnerability.
     * </p>
     * 
     * @param cwes
     *        The Common Weakness Enumerations (CWEs) associated with the vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withCwes(java.util.Collection<String> cwes) {
        setCwes(cwes);
        return this;
    }

    /**
     * <p>
     * The Exploit Prediction Scoring System (EPSS) score of the vulnerability.
     * </p>
     * 
     * @param epssScore
     *        The Exploit Prediction Scoring System (EPSS) score of the vulnerability.
     */

    public void setEpssScore(Double epssScore) {
        this.epssScore = epssScore;
    }

    /**
     * <p>
     * The Exploit Prediction Scoring System (EPSS) score of the vulnerability.
     * </p>
     * 
     * @return The Exploit Prediction Scoring System (EPSS) score of the vulnerability.
     */

    public Double getEpssScore() {
        return this.epssScore;
    }

    /**
     * <p>
     * The Exploit Prediction Scoring System (EPSS) score of the vulnerability.
     * </p>
     * 
     * @param epssScore
     *        The Exploit Prediction Scoring System (EPSS) score of the vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withEpssScore(Double epssScore) {
        setEpssScore(epssScore);
        return this;
    }

    /**
     * <p>
     * Information on the evidence of the vulnerability.
     * </p>
     * 
     * @return Information on the evidence of the vulnerability.
     */

    public java.util.List<Evidence> getEvidences() {
        return evidences;
    }

    /**
     * <p>
     * Information on the evidence of the vulnerability.
     * </p>
     * 
     * @param evidences
     *        Information on the evidence of the vulnerability.
     */

    public void setEvidences(java.util.Collection<Evidence> evidences) {
        if (evidences == null) {
            this.evidences = null;
            return;
        }

        this.evidences = new java.util.ArrayList<Evidence>(evidences);
    }

    /**
     * <p>
     * Information on the evidence of the vulnerability.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvidences(java.util.Collection)} or {@link #withEvidences(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param evidences
     *        Information on the evidence of the vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withEvidences(Evidence... evidences) {
        if (this.evidences == null) {
            setEvidences(new java.util.ArrayList<Evidence>(evidences.length));
        }
        for (Evidence ele : evidences) {
            this.evidences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information on the evidence of the vulnerability.
     * </p>
     * 
     * @param evidences
     *        Information on the evidence of the vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withEvidences(java.util.Collection<Evidence> evidences) {
        setEvidences(evidences);
        return this;
    }

    /**
     * @param exploitObserved
     */

    public void setExploitObserved(ExploitObserved exploitObserved) {
        this.exploitObserved = exploitObserved;
    }

    /**
     * @return
     */

    public ExploitObserved getExploitObserved() {
        return this.exploitObserved;
    }

    /**
     * @param exploitObserved
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withExploitObserved(ExploitObserved exploitObserved) {
        setExploitObserved(exploitObserved);
        return this;
    }

    /**
     * <p>
     * The finding ARN that the vulnerability details are associated with.
     * </p>
     * 
     * @param findingArn
     *        The finding ARN that the vulnerability details are associated with.
     */

    public void setFindingArn(String findingArn) {
        this.findingArn = findingArn;
    }

    /**
     * <p>
     * The finding ARN that the vulnerability details are associated with.
     * </p>
     * 
     * @return The finding ARN that the vulnerability details are associated with.
     */

    public String getFindingArn() {
        return this.findingArn;
    }

    /**
     * <p>
     * The finding ARN that the vulnerability details are associated with.
     * </p>
     * 
     * @param findingArn
     *        The finding ARN that the vulnerability details are associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withFindingArn(String findingArn) {
        setFindingArn(findingArn);
        return this;
    }

    /**
     * <p>
     * The reference URLs for the vulnerability data.
     * </p>
     * 
     * @return The reference URLs for the vulnerability data.
     */

    public java.util.List<String> getReferenceUrls() {
        return referenceUrls;
    }

    /**
     * <p>
     * The reference URLs for the vulnerability data.
     * </p>
     * 
     * @param referenceUrls
     *        The reference URLs for the vulnerability data.
     */

    public void setReferenceUrls(java.util.Collection<String> referenceUrls) {
        if (referenceUrls == null) {
            this.referenceUrls = null;
            return;
        }

        this.referenceUrls = new java.util.ArrayList<String>(referenceUrls);
    }

    /**
     * <p>
     * The reference URLs for the vulnerability data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReferenceUrls(java.util.Collection)} or {@link #withReferenceUrls(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param referenceUrls
     *        The reference URLs for the vulnerability data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withReferenceUrls(String... referenceUrls) {
        if (this.referenceUrls == null) {
            setReferenceUrls(new java.util.ArrayList<String>(referenceUrls.length));
        }
        for (String ele : referenceUrls) {
            this.referenceUrls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reference URLs for the vulnerability data.
     * </p>
     * 
     * @param referenceUrls
     *        The reference URLs for the vulnerability data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withReferenceUrls(java.util.Collection<String> referenceUrls) {
        setReferenceUrls(referenceUrls);
        return this;
    }

    /**
     * <p>
     * The risk score of the vulnerability.
     * </p>
     * 
     * @param riskScore
     *        The risk score of the vulnerability.
     */

    public void setRiskScore(Integer riskScore) {
        this.riskScore = riskScore;
    }

    /**
     * <p>
     * The risk score of the vulnerability.
     * </p>
     * 
     * @return The risk score of the vulnerability.
     */

    public Integer getRiskScore() {
        return this.riskScore;
    }

    /**
     * <p>
     * The risk score of the vulnerability.
     * </p>
     * 
     * @param riskScore
     *        The risk score of the vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withRiskScore(Integer riskScore) {
        setRiskScore(riskScore);
        return this;
    }

    /**
     * <p>
     * The known malware tools or kits that can exploit the vulnerability.
     * </p>
     * 
     * @return The known malware tools or kits that can exploit the vulnerability.
     */

    public java.util.List<String> getTools() {
        return tools;
    }

    /**
     * <p>
     * The known malware tools or kits that can exploit the vulnerability.
     * </p>
     * 
     * @param tools
     *        The known malware tools or kits that can exploit the vulnerability.
     */

    public void setTools(java.util.Collection<String> tools) {
        if (tools == null) {
            this.tools = null;
            return;
        }

        this.tools = new java.util.ArrayList<String>(tools);
    }

    /**
     * <p>
     * The known malware tools or kits that can exploit the vulnerability.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTools(java.util.Collection)} or {@link #withTools(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tools
     *        The known malware tools or kits that can exploit the vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withTools(String... tools) {
        if (this.tools == null) {
            setTools(new java.util.ArrayList<String>(tools.length));
        }
        for (String ele : tools) {
            this.tools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The known malware tools or kits that can exploit the vulnerability.
     * </p>
     * 
     * @param tools
     *        The known malware tools or kits that can exploit the vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withTools(java.util.Collection<String> tools) {
        setTools(tools);
        return this;
    }

    /**
     * <p>
     * The MITRE adversary tactics, techniques, or procedures (TTPs) associated with the vulnerability.
     * </p>
     * 
     * @return The MITRE adversary tactics, techniques, or procedures (TTPs) associated with the vulnerability.
     */

    public java.util.List<String> getTtps() {
        return ttps;
    }

    /**
     * <p>
     * The MITRE adversary tactics, techniques, or procedures (TTPs) associated with the vulnerability.
     * </p>
     * 
     * @param ttps
     *        The MITRE adversary tactics, techniques, or procedures (TTPs) associated with the vulnerability.
     */

    public void setTtps(java.util.Collection<String> ttps) {
        if (ttps == null) {
            this.ttps = null;
            return;
        }

        this.ttps = new java.util.ArrayList<String>(ttps);
    }

    /**
     * <p>
     * The MITRE adversary tactics, techniques, or procedures (TTPs) associated with the vulnerability.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTtps(java.util.Collection)} or {@link #withTtps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ttps
     *        The MITRE adversary tactics, techniques, or procedures (TTPs) associated with the vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withTtps(String... ttps) {
        if (this.ttps == null) {
            setTtps(new java.util.ArrayList<String>(ttps.length));
        }
        for (String ele : ttps) {
            this.ttps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The MITRE adversary tactics, techniques, or procedures (TTPs) associated with the vulnerability.
     * </p>
     * 
     * @param ttps
     *        The MITRE adversary tactics, techniques, or procedures (TTPs) associated with the vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetail withTtps(java.util.Collection<String> ttps) {
        setTtps(ttps);
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
        if (getCisaData() != null)
            sb.append("CisaData: ").append(getCisaData()).append(",");
        if (getCwes() != null)
            sb.append("Cwes: ").append(getCwes()).append(",");
        if (getEpssScore() != null)
            sb.append("EpssScore: ").append(getEpssScore()).append(",");
        if (getEvidences() != null)
            sb.append("Evidences: ").append(getEvidences()).append(",");
        if (getExploitObserved() != null)
            sb.append("ExploitObserved: ").append(getExploitObserved()).append(",");
        if (getFindingArn() != null)
            sb.append("FindingArn: ").append(getFindingArn()).append(",");
        if (getReferenceUrls() != null)
            sb.append("ReferenceUrls: ").append(getReferenceUrls()).append(",");
        if (getRiskScore() != null)
            sb.append("RiskScore: ").append(getRiskScore()).append(",");
        if (getTools() != null)
            sb.append("Tools: ").append(getTools()).append(",");
        if (getTtps() != null)
            sb.append("Ttps: ").append(getTtps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingDetail == false)
            return false;
        FindingDetail other = (FindingDetail) obj;
        if (other.getCisaData() == null ^ this.getCisaData() == null)
            return false;
        if (other.getCisaData() != null && other.getCisaData().equals(this.getCisaData()) == false)
            return false;
        if (other.getCwes() == null ^ this.getCwes() == null)
            return false;
        if (other.getCwes() != null && other.getCwes().equals(this.getCwes()) == false)
            return false;
        if (other.getEpssScore() == null ^ this.getEpssScore() == null)
            return false;
        if (other.getEpssScore() != null && other.getEpssScore().equals(this.getEpssScore()) == false)
            return false;
        if (other.getEvidences() == null ^ this.getEvidences() == null)
            return false;
        if (other.getEvidences() != null && other.getEvidences().equals(this.getEvidences()) == false)
            return false;
        if (other.getExploitObserved() == null ^ this.getExploitObserved() == null)
            return false;
        if (other.getExploitObserved() != null && other.getExploitObserved().equals(this.getExploitObserved()) == false)
            return false;
        if (other.getFindingArn() == null ^ this.getFindingArn() == null)
            return false;
        if (other.getFindingArn() != null && other.getFindingArn().equals(this.getFindingArn()) == false)
            return false;
        if (other.getReferenceUrls() == null ^ this.getReferenceUrls() == null)
            return false;
        if (other.getReferenceUrls() != null && other.getReferenceUrls().equals(this.getReferenceUrls()) == false)
            return false;
        if (other.getRiskScore() == null ^ this.getRiskScore() == null)
            return false;
        if (other.getRiskScore() != null && other.getRiskScore().equals(this.getRiskScore()) == false)
            return false;
        if (other.getTools() == null ^ this.getTools() == null)
            return false;
        if (other.getTools() != null && other.getTools().equals(this.getTools()) == false)
            return false;
        if (other.getTtps() == null ^ this.getTtps() == null)
            return false;
        if (other.getTtps() != null && other.getTtps().equals(this.getTtps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCisaData() == null) ? 0 : getCisaData().hashCode());
        hashCode = prime * hashCode + ((getCwes() == null) ? 0 : getCwes().hashCode());
        hashCode = prime * hashCode + ((getEpssScore() == null) ? 0 : getEpssScore().hashCode());
        hashCode = prime * hashCode + ((getEvidences() == null) ? 0 : getEvidences().hashCode());
        hashCode = prime * hashCode + ((getExploitObserved() == null) ? 0 : getExploitObserved().hashCode());
        hashCode = prime * hashCode + ((getFindingArn() == null) ? 0 : getFindingArn().hashCode());
        hashCode = prime * hashCode + ((getReferenceUrls() == null) ? 0 : getReferenceUrls().hashCode());
        hashCode = prime * hashCode + ((getRiskScore() == null) ? 0 : getRiskScore().hashCode());
        hashCode = prime * hashCode + ((getTools() == null) ? 0 : getTools().hashCode());
        hashCode = prime * hashCode + ((getTtps() == null) ? 0 : getTtps().hashCode());
        return hashCode;
    }

    @Override
    public FindingDetail clone() {
        try {
            return (FindingDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.FindingDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
