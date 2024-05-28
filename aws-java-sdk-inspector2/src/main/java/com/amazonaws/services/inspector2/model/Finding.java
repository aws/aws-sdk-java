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
 * Details about an Amazon Inspector finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Finding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Finding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID associated with the finding.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * Details about the code vulnerability identified in a Lambda function used to filter findings.
     * </p>
     */
    private CodeVulnerabilityDetails codeVulnerabilityDetails;
    /**
     * <p>
     * The description of the finding.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The finding's EPSS score.
     * </p>
     */
    private EpssDetails epss;
    /**
     * <p>
     * If a finding discovered in your environment has an exploit available.
     * </p>
     */
    private String exploitAvailable;
    /**
     * <p>
     * The details of an exploit available for a finding discovered in your environment.
     * </p>
     */
    private ExploitabilityDetails exploitabilityDetails;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the finding.
     * </p>
     */
    private String findingArn;
    /**
     * <p>
     * The date and time that the finding was first observed.
     * </p>
     */
    private java.util.Date firstObservedAt;
    /**
     * <p>
     * Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     * <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     * packages identified in the finding have fixes available through updated versions.
     * </p>
     */
    private String fixAvailable;
    /**
     * <p>
     * The Amazon Inspector score given to the finding.
     * </p>
     */
    private Double inspectorScore;
    /**
     * <p>
     * An object that contains details of the Amazon Inspector score.
     * </p>
     */
    private InspectorScoreDetails inspectorScoreDetails;
    /**
     * <p>
     * The date and time the finding was last observed. This timestamp for this field remains unchanged until a finding
     * is updated.
     * </p>
     */
    private java.util.Date lastObservedAt;
    /**
     * <p>
     * An object that contains the details of a network reachability finding.
     * </p>
     */
    private NetworkReachabilityDetails networkReachabilityDetails;
    /**
     * <p>
     * An object that contains the details of a package vulnerability finding.
     * </p>
     */
    private PackageVulnerabilityDetails packageVulnerabilityDetails;
    /**
     * <p>
     * An object that contains the details about how to remediate a finding.
     * </p>
     */
    private Remediation remediation;
    /**
     * <p>
     * Contains information on the resources involved in a finding. The <code>resource</code> value determines the valid
     * values for <code>type</code> in your request. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the Amazon
     * Inspector user guide.
     * </p>
     */
    private java.util.List<Resource> resources;
    /**
     * <p>
     * The severity of the finding. <code>UNTRIAGED</code> applies to <code>PACKAGE_VULNERABILITY</code> type findings
     * that the vendor has not assigned a severity yet. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-understanding-severity.html">Severity levels for
     * findings</a> in the Amazon Inspector user guide.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The status of the finding.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The title of the finding.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The type of the finding. The <code>type</code> value determines the valid values for <code>resource</code> in
     * your request. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the Amazon
     * Inspector user guide.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The date and time the finding was last updated at.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Web Services account ID associated with the finding.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID associated with the finding.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the finding.
     * </p>
     * 
     * @return The Amazon Web Services account ID associated with the finding.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the finding.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID associated with the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * Details about the code vulnerability identified in a Lambda function used to filter findings.
     * </p>
     * 
     * @param codeVulnerabilityDetails
     *        Details about the code vulnerability identified in a Lambda function used to filter findings.
     */

    public void setCodeVulnerabilityDetails(CodeVulnerabilityDetails codeVulnerabilityDetails) {
        this.codeVulnerabilityDetails = codeVulnerabilityDetails;
    }

    /**
     * <p>
     * Details about the code vulnerability identified in a Lambda function used to filter findings.
     * </p>
     * 
     * @return Details about the code vulnerability identified in a Lambda function used to filter findings.
     */

    public CodeVulnerabilityDetails getCodeVulnerabilityDetails() {
        return this.codeVulnerabilityDetails;
    }

    /**
     * <p>
     * Details about the code vulnerability identified in a Lambda function used to filter findings.
     * </p>
     * 
     * @param codeVulnerabilityDetails
     *        Details about the code vulnerability identified in a Lambda function used to filter findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withCodeVulnerabilityDetails(CodeVulnerabilityDetails codeVulnerabilityDetails) {
        setCodeVulnerabilityDetails(codeVulnerabilityDetails);
        return this;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @param description
     *        The description of the finding.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @return The description of the finding.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the finding.
     * </p>
     * 
     * @param description
     *        The description of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The finding's EPSS score.
     * </p>
     * 
     * @param epss
     *        The finding's EPSS score.
     */

    public void setEpss(EpssDetails epss) {
        this.epss = epss;
    }

    /**
     * <p>
     * The finding's EPSS score.
     * </p>
     * 
     * @return The finding's EPSS score.
     */

    public EpssDetails getEpss() {
        return this.epss;
    }

    /**
     * <p>
     * The finding's EPSS score.
     * </p>
     * 
     * @param epss
     *        The finding's EPSS score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withEpss(EpssDetails epss) {
        setEpss(epss);
        return this;
    }

    /**
     * <p>
     * If a finding discovered in your environment has an exploit available.
     * </p>
     * 
     * @param exploitAvailable
     *        If a finding discovered in your environment has an exploit available.
     * @see ExploitAvailable
     */

    public void setExploitAvailable(String exploitAvailable) {
        this.exploitAvailable = exploitAvailable;
    }

    /**
     * <p>
     * If a finding discovered in your environment has an exploit available.
     * </p>
     * 
     * @return If a finding discovered in your environment has an exploit available.
     * @see ExploitAvailable
     */

    public String getExploitAvailable() {
        return this.exploitAvailable;
    }

    /**
     * <p>
     * If a finding discovered in your environment has an exploit available.
     * </p>
     * 
     * @param exploitAvailable
     *        If a finding discovered in your environment has an exploit available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExploitAvailable
     */

    public Finding withExploitAvailable(String exploitAvailable) {
        setExploitAvailable(exploitAvailable);
        return this;
    }

    /**
     * <p>
     * If a finding discovered in your environment has an exploit available.
     * </p>
     * 
     * @param exploitAvailable
     *        If a finding discovered in your environment has an exploit available.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExploitAvailable
     */

    public Finding withExploitAvailable(ExploitAvailable exploitAvailable) {
        this.exploitAvailable = exploitAvailable.toString();
        return this;
    }

    /**
     * <p>
     * The details of an exploit available for a finding discovered in your environment.
     * </p>
     * 
     * @param exploitabilityDetails
     *        The details of an exploit available for a finding discovered in your environment.
     */

    public void setExploitabilityDetails(ExploitabilityDetails exploitabilityDetails) {
        this.exploitabilityDetails = exploitabilityDetails;
    }

    /**
     * <p>
     * The details of an exploit available for a finding discovered in your environment.
     * </p>
     * 
     * @return The details of an exploit available for a finding discovered in your environment.
     */

    public ExploitabilityDetails getExploitabilityDetails() {
        return this.exploitabilityDetails;
    }

    /**
     * <p>
     * The details of an exploit available for a finding discovered in your environment.
     * </p>
     * 
     * @param exploitabilityDetails
     *        The details of an exploit available for a finding discovered in your environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withExploitabilityDetails(ExploitabilityDetails exploitabilityDetails) {
        setExploitabilityDetails(exploitabilityDetails);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the finding.
     * </p>
     * 
     * @param findingArn
     *        The Amazon Resource Number (ARN) of the finding.
     */

    public void setFindingArn(String findingArn) {
        this.findingArn = findingArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the finding.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the finding.
     */

    public String getFindingArn() {
        return this.findingArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the finding.
     * </p>
     * 
     * @param findingArn
     *        The Amazon Resource Number (ARN) of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withFindingArn(String findingArn) {
        setFindingArn(findingArn);
        return this;
    }

    /**
     * <p>
     * The date and time that the finding was first observed.
     * </p>
     * 
     * @param firstObservedAt
     *        The date and time that the finding was first observed.
     */

    public void setFirstObservedAt(java.util.Date firstObservedAt) {
        this.firstObservedAt = firstObservedAt;
    }

    /**
     * <p>
     * The date and time that the finding was first observed.
     * </p>
     * 
     * @return The date and time that the finding was first observed.
     */

    public java.util.Date getFirstObservedAt() {
        return this.firstObservedAt;
    }

    /**
     * <p>
     * The date and time that the finding was first observed.
     * </p>
     * 
     * @param firstObservedAt
     *        The date and time that the finding was first observed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withFirstObservedAt(java.util.Date firstObservedAt) {
        setFirstObservedAt(firstObservedAt);
        return this;
    }

    /**
     * <p>
     * Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     * <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     * packages identified in the finding have fixes available through updated versions.
     * </p>
     * 
     * @param fixAvailable
     *        Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     *        <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     *        packages identified in the finding have fixes available through updated versions.
     * @see FixAvailable
     */

    public void setFixAvailable(String fixAvailable) {
        this.fixAvailable = fixAvailable;
    }

    /**
     * <p>
     * Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     * <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     * packages identified in the finding have fixes available through updated versions.
     * </p>
     * 
     * @return Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     *         <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     *         packages identified in the finding have fixes available through updated versions.
     * @see FixAvailable
     */

    public String getFixAvailable() {
        return this.fixAvailable;
    }

    /**
     * <p>
     * Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     * <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     * packages identified in the finding have fixes available through updated versions.
     * </p>
     * 
     * @param fixAvailable
     *        Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     *        <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     *        packages identified in the finding have fixes available through updated versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FixAvailable
     */

    public Finding withFixAvailable(String fixAvailable) {
        setFixAvailable(fixAvailable);
        return this;
    }

    /**
     * <p>
     * Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     * <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     * packages identified in the finding have fixes available through updated versions.
     * </p>
     * 
     * @param fixAvailable
     *        Details on whether a fix is available through a version update. This value can be <code>YES</code>,
     *        <code>NO</code>, or <code>PARTIAL</code>. A <code>PARTIAL</code> fix means that some, but not all, of the
     *        packages identified in the finding have fixes available through updated versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FixAvailable
     */

    public Finding withFixAvailable(FixAvailable fixAvailable) {
        this.fixAvailable = fixAvailable.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Inspector score given to the finding.
     * </p>
     * 
     * @param inspectorScore
     *        The Amazon Inspector score given to the finding.
     */

    public void setInspectorScore(Double inspectorScore) {
        this.inspectorScore = inspectorScore;
    }

    /**
     * <p>
     * The Amazon Inspector score given to the finding.
     * </p>
     * 
     * @return The Amazon Inspector score given to the finding.
     */

    public Double getInspectorScore() {
        return this.inspectorScore;
    }

    /**
     * <p>
     * The Amazon Inspector score given to the finding.
     * </p>
     * 
     * @param inspectorScore
     *        The Amazon Inspector score given to the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withInspectorScore(Double inspectorScore) {
        setInspectorScore(inspectorScore);
        return this;
    }

    /**
     * <p>
     * An object that contains details of the Amazon Inspector score.
     * </p>
     * 
     * @param inspectorScoreDetails
     *        An object that contains details of the Amazon Inspector score.
     */

    public void setInspectorScoreDetails(InspectorScoreDetails inspectorScoreDetails) {
        this.inspectorScoreDetails = inspectorScoreDetails;
    }

    /**
     * <p>
     * An object that contains details of the Amazon Inspector score.
     * </p>
     * 
     * @return An object that contains details of the Amazon Inspector score.
     */

    public InspectorScoreDetails getInspectorScoreDetails() {
        return this.inspectorScoreDetails;
    }

    /**
     * <p>
     * An object that contains details of the Amazon Inspector score.
     * </p>
     * 
     * @param inspectorScoreDetails
     *        An object that contains details of the Amazon Inspector score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withInspectorScoreDetails(InspectorScoreDetails inspectorScoreDetails) {
        setInspectorScoreDetails(inspectorScoreDetails);
        return this;
    }

    /**
     * <p>
     * The date and time the finding was last observed. This timestamp for this field remains unchanged until a finding
     * is updated.
     * </p>
     * 
     * @param lastObservedAt
     *        The date and time the finding was last observed. This timestamp for this field remains unchanged until a
     *        finding is updated.
     */

    public void setLastObservedAt(java.util.Date lastObservedAt) {
        this.lastObservedAt = lastObservedAt;
    }

    /**
     * <p>
     * The date and time the finding was last observed. This timestamp for this field remains unchanged until a finding
     * is updated.
     * </p>
     * 
     * @return The date and time the finding was last observed. This timestamp for this field remains unchanged until a
     *         finding is updated.
     */

    public java.util.Date getLastObservedAt() {
        return this.lastObservedAt;
    }

    /**
     * <p>
     * The date and time the finding was last observed. This timestamp for this field remains unchanged until a finding
     * is updated.
     * </p>
     * 
     * @param lastObservedAt
     *        The date and time the finding was last observed. This timestamp for this field remains unchanged until a
     *        finding is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withLastObservedAt(java.util.Date lastObservedAt) {
        setLastObservedAt(lastObservedAt);
        return this;
    }

    /**
     * <p>
     * An object that contains the details of a network reachability finding.
     * </p>
     * 
     * @param networkReachabilityDetails
     *        An object that contains the details of a network reachability finding.
     */

    public void setNetworkReachabilityDetails(NetworkReachabilityDetails networkReachabilityDetails) {
        this.networkReachabilityDetails = networkReachabilityDetails;
    }

    /**
     * <p>
     * An object that contains the details of a network reachability finding.
     * </p>
     * 
     * @return An object that contains the details of a network reachability finding.
     */

    public NetworkReachabilityDetails getNetworkReachabilityDetails() {
        return this.networkReachabilityDetails;
    }

    /**
     * <p>
     * An object that contains the details of a network reachability finding.
     * </p>
     * 
     * @param networkReachabilityDetails
     *        An object that contains the details of a network reachability finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withNetworkReachabilityDetails(NetworkReachabilityDetails networkReachabilityDetails) {
        setNetworkReachabilityDetails(networkReachabilityDetails);
        return this;
    }

    /**
     * <p>
     * An object that contains the details of a package vulnerability finding.
     * </p>
     * 
     * @param packageVulnerabilityDetails
     *        An object that contains the details of a package vulnerability finding.
     */

    public void setPackageVulnerabilityDetails(PackageVulnerabilityDetails packageVulnerabilityDetails) {
        this.packageVulnerabilityDetails = packageVulnerabilityDetails;
    }

    /**
     * <p>
     * An object that contains the details of a package vulnerability finding.
     * </p>
     * 
     * @return An object that contains the details of a package vulnerability finding.
     */

    public PackageVulnerabilityDetails getPackageVulnerabilityDetails() {
        return this.packageVulnerabilityDetails;
    }

    /**
     * <p>
     * An object that contains the details of a package vulnerability finding.
     * </p>
     * 
     * @param packageVulnerabilityDetails
     *        An object that contains the details of a package vulnerability finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withPackageVulnerabilityDetails(PackageVulnerabilityDetails packageVulnerabilityDetails) {
        setPackageVulnerabilityDetails(packageVulnerabilityDetails);
        return this;
    }

    /**
     * <p>
     * An object that contains the details about how to remediate a finding.
     * </p>
     * 
     * @param remediation
     *        An object that contains the details about how to remediate a finding.
     */

    public void setRemediation(Remediation remediation) {
        this.remediation = remediation;
    }

    /**
     * <p>
     * An object that contains the details about how to remediate a finding.
     * </p>
     * 
     * @return An object that contains the details about how to remediate a finding.
     */

    public Remediation getRemediation() {
        return this.remediation;
    }

    /**
     * <p>
     * An object that contains the details about how to remediate a finding.
     * </p>
     * 
     * @param remediation
     *        An object that contains the details about how to remediate a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withRemediation(Remediation remediation) {
        setRemediation(remediation);
        return this;
    }

    /**
     * <p>
     * Contains information on the resources involved in a finding. The <code>resource</code> value determines the valid
     * values for <code>type</code> in your request. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the Amazon
     * Inspector user guide.
     * </p>
     * 
     * @return Contains information on the resources involved in a finding. The <code>resource</code> value determines
     *         the valid values for <code>type</code> in your request. For more information, see <a
     *         href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the
     *         Amazon Inspector user guide.
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * <p>
     * Contains information on the resources involved in a finding. The <code>resource</code> value determines the valid
     * values for <code>type</code> in your request. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the Amazon
     * Inspector user guide.
     * </p>
     * 
     * @param resources
     *        Contains information on the resources involved in a finding. The <code>resource</code> value determines
     *        the valid values for <code>type</code> in your request. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the
     *        Amazon Inspector user guide.
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<Resource>(resources);
    }

    /**
     * <p>
     * Contains information on the resources involved in a finding. The <code>resource</code> value determines the valid
     * values for <code>type</code> in your request. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the Amazon
     * Inspector user guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        Contains information on the resources involved in a finding. The <code>resource</code> value determines
     *        the valid values for <code>type</code> in your request. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the
     *        Amazon Inspector user guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<Resource>(resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information on the resources involved in a finding. The <code>resource</code> value determines the valid
     * values for <code>type</code> in your request. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the Amazon
     * Inspector user guide.
     * </p>
     * 
     * @param resources
     *        Contains information on the resources involved in a finding. The <code>resource</code> value determines
     *        the valid values for <code>type</code> in your request. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the
     *        Amazon Inspector user guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The severity of the finding. <code>UNTRIAGED</code> applies to <code>PACKAGE_VULNERABILITY</code> type findings
     * that the vendor has not assigned a severity yet. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-understanding-severity.html">Severity levels for
     * findings</a> in the Amazon Inspector user guide.
     * </p>
     * 
     * @param severity
     *        The severity of the finding. <code>UNTRIAGED</code> applies to <code>PACKAGE_VULNERABILITY</code> type
     *        findings that the vendor has not assigned a severity yet. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/user/findings-understanding-severity.html">Severity
     *        levels for findings</a> in the Amazon Inspector user guide.
     * @see Severity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the finding. <code>UNTRIAGED</code> applies to <code>PACKAGE_VULNERABILITY</code> type findings
     * that the vendor has not assigned a severity yet. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-understanding-severity.html">Severity levels for
     * findings</a> in the Amazon Inspector user guide.
     * </p>
     * 
     * @return The severity of the finding. <code>UNTRIAGED</code> applies to <code>PACKAGE_VULNERABILITY</code> type
     *         findings that the vendor has not assigned a severity yet. For more information, see <a
     *         href="https://docs.aws.amazon.com/inspector/latest/user/findings-understanding-severity.html">Severity
     *         levels for findings</a> in the Amazon Inspector user guide.
     * @see Severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the finding. <code>UNTRIAGED</code> applies to <code>PACKAGE_VULNERABILITY</code> type findings
     * that the vendor has not assigned a severity yet. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-understanding-severity.html">Severity levels for
     * findings</a> in the Amazon Inspector user guide.
     * </p>
     * 
     * @param severity
     *        The severity of the finding. <code>UNTRIAGED</code> applies to <code>PACKAGE_VULNERABILITY</code> type
     *        findings that the vendor has not assigned a severity yet. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/user/findings-understanding-severity.html">Severity
     *        levels for findings</a> in the Amazon Inspector user guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public Finding withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity of the finding. <code>UNTRIAGED</code> applies to <code>PACKAGE_VULNERABILITY</code> type findings
     * that the vendor has not assigned a severity yet. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-understanding-severity.html">Severity levels for
     * findings</a> in the Amazon Inspector user guide.
     * </p>
     * 
     * @param severity
     *        The severity of the finding. <code>UNTRIAGED</code> applies to <code>PACKAGE_VULNERABILITY</code> type
     *        findings that the vendor has not assigned a severity yet. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/user/findings-understanding-severity.html">Severity
     *        levels for findings</a> in the Amazon Inspector user guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public Finding withSeverity(Severity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @param status
     *        The status of the finding.
     * @see FindingStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @return The status of the finding.
     * @see FindingStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @param status
     *        The status of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatus
     */

    public Finding withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the finding.
     * </p>
     * 
     * @param status
     *        The status of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingStatus
     */

    public Finding withStatus(FindingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The title of the finding.
     * </p>
     * 
     * @param title
     *        The title of the finding.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the finding.
     * </p>
     * 
     * @return The title of the finding.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the finding.
     * </p>
     * 
     * @param title
     *        The title of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The type of the finding. The <code>type</code> value determines the valid values for <code>resource</code> in
     * your request. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the Amazon
     * Inspector user guide.
     * </p>
     * 
     * @param type
     *        The type of the finding. The <code>type</code> value determines the valid values for <code>resource</code>
     *        in your request. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the
     *        Amazon Inspector user guide.
     * @see FindingType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the finding. The <code>type</code> value determines the valid values for <code>resource</code> in
     * your request. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the Amazon
     * Inspector user guide.
     * </p>
     * 
     * @return The type of the finding. The <code>type</code> value determines the valid values for
     *         <code>resource</code> in your request. For more information, see <a
     *         href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the
     *         Amazon Inspector user guide.
     * @see FindingType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the finding. The <code>type</code> value determines the valid values for <code>resource</code> in
     * your request. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the Amazon
     * Inspector user guide.
     * </p>
     * 
     * @param type
     *        The type of the finding. The <code>type</code> value determines the valid values for <code>resource</code>
     *        in your request. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the
     *        Amazon Inspector user guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingType
     */

    public Finding withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the finding. The <code>type</code> value determines the valid values for <code>resource</code> in
     * your request. For more information, see <a
     * href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the Amazon
     * Inspector user guide.
     * </p>
     * 
     * @param type
     *        The type of the finding. The <code>type</code> value determines the valid values for <code>resource</code>
     *        in your request. For more information, see <a
     *        href="https://docs.aws.amazon.com/inspector/latest/user/findings-types.html">Finding types</a> in the
     *        Amazon Inspector user guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingType
     */

    public Finding withType(FindingType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the finding was last updated at.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the finding was last updated at.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time the finding was last updated at.
     * </p>
     * 
     * @return The date and time the finding was last updated at.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time the finding was last updated at.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the finding was last updated at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Finding withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getCodeVulnerabilityDetails() != null)
            sb.append("CodeVulnerabilityDetails: ").append(getCodeVulnerabilityDetails()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEpss() != null)
            sb.append("Epss: ").append(getEpss()).append(",");
        if (getExploitAvailable() != null)
            sb.append("ExploitAvailable: ").append(getExploitAvailable()).append(",");
        if (getExploitabilityDetails() != null)
            sb.append("ExploitabilityDetails: ").append(getExploitabilityDetails()).append(",");
        if (getFindingArn() != null)
            sb.append("FindingArn: ").append(getFindingArn()).append(",");
        if (getFirstObservedAt() != null)
            sb.append("FirstObservedAt: ").append(getFirstObservedAt()).append(",");
        if (getFixAvailable() != null)
            sb.append("FixAvailable: ").append(getFixAvailable()).append(",");
        if (getInspectorScore() != null)
            sb.append("InspectorScore: ").append(getInspectorScore()).append(",");
        if (getInspectorScoreDetails() != null)
            sb.append("InspectorScoreDetails: ").append(getInspectorScoreDetails()).append(",");
        if (getLastObservedAt() != null)
            sb.append("LastObservedAt: ").append(getLastObservedAt()).append(",");
        if (getNetworkReachabilityDetails() != null)
            sb.append("NetworkReachabilityDetails: ").append(getNetworkReachabilityDetails()).append(",");
        if (getPackageVulnerabilityDetails() != null)
            sb.append("PackageVulnerabilityDetails: ").append(getPackageVulnerabilityDetails()).append(",");
        if (getRemediation() != null)
            sb.append("Remediation: ").append(getRemediation()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Finding == false)
            return false;
        Finding other = (Finding) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getCodeVulnerabilityDetails() == null ^ this.getCodeVulnerabilityDetails() == null)
            return false;
        if (other.getCodeVulnerabilityDetails() != null && other.getCodeVulnerabilityDetails().equals(this.getCodeVulnerabilityDetails()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEpss() == null ^ this.getEpss() == null)
            return false;
        if (other.getEpss() != null && other.getEpss().equals(this.getEpss()) == false)
            return false;
        if (other.getExploitAvailable() == null ^ this.getExploitAvailable() == null)
            return false;
        if (other.getExploitAvailable() != null && other.getExploitAvailable().equals(this.getExploitAvailable()) == false)
            return false;
        if (other.getExploitabilityDetails() == null ^ this.getExploitabilityDetails() == null)
            return false;
        if (other.getExploitabilityDetails() != null && other.getExploitabilityDetails().equals(this.getExploitabilityDetails()) == false)
            return false;
        if (other.getFindingArn() == null ^ this.getFindingArn() == null)
            return false;
        if (other.getFindingArn() != null && other.getFindingArn().equals(this.getFindingArn()) == false)
            return false;
        if (other.getFirstObservedAt() == null ^ this.getFirstObservedAt() == null)
            return false;
        if (other.getFirstObservedAt() != null && other.getFirstObservedAt().equals(this.getFirstObservedAt()) == false)
            return false;
        if (other.getFixAvailable() == null ^ this.getFixAvailable() == null)
            return false;
        if (other.getFixAvailable() != null && other.getFixAvailable().equals(this.getFixAvailable()) == false)
            return false;
        if (other.getInspectorScore() == null ^ this.getInspectorScore() == null)
            return false;
        if (other.getInspectorScore() != null && other.getInspectorScore().equals(this.getInspectorScore()) == false)
            return false;
        if (other.getInspectorScoreDetails() == null ^ this.getInspectorScoreDetails() == null)
            return false;
        if (other.getInspectorScoreDetails() != null && other.getInspectorScoreDetails().equals(this.getInspectorScoreDetails()) == false)
            return false;
        if (other.getLastObservedAt() == null ^ this.getLastObservedAt() == null)
            return false;
        if (other.getLastObservedAt() != null && other.getLastObservedAt().equals(this.getLastObservedAt()) == false)
            return false;
        if (other.getNetworkReachabilityDetails() == null ^ this.getNetworkReachabilityDetails() == null)
            return false;
        if (other.getNetworkReachabilityDetails() != null && other.getNetworkReachabilityDetails().equals(this.getNetworkReachabilityDetails()) == false)
            return false;
        if (other.getPackageVulnerabilityDetails() == null ^ this.getPackageVulnerabilityDetails() == null)
            return false;
        if (other.getPackageVulnerabilityDetails() != null && other.getPackageVulnerabilityDetails().equals(this.getPackageVulnerabilityDetails()) == false)
            return false;
        if (other.getRemediation() == null ^ this.getRemediation() == null)
            return false;
        if (other.getRemediation() != null && other.getRemediation().equals(this.getRemediation()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getCodeVulnerabilityDetails() == null) ? 0 : getCodeVulnerabilityDetails().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEpss() == null) ? 0 : getEpss().hashCode());
        hashCode = prime * hashCode + ((getExploitAvailable() == null) ? 0 : getExploitAvailable().hashCode());
        hashCode = prime * hashCode + ((getExploitabilityDetails() == null) ? 0 : getExploitabilityDetails().hashCode());
        hashCode = prime * hashCode + ((getFindingArn() == null) ? 0 : getFindingArn().hashCode());
        hashCode = prime * hashCode + ((getFirstObservedAt() == null) ? 0 : getFirstObservedAt().hashCode());
        hashCode = prime * hashCode + ((getFixAvailable() == null) ? 0 : getFixAvailable().hashCode());
        hashCode = prime * hashCode + ((getInspectorScore() == null) ? 0 : getInspectorScore().hashCode());
        hashCode = prime * hashCode + ((getInspectorScoreDetails() == null) ? 0 : getInspectorScoreDetails().hashCode());
        hashCode = prime * hashCode + ((getLastObservedAt() == null) ? 0 : getLastObservedAt().hashCode());
        hashCode = prime * hashCode + ((getNetworkReachabilityDetails() == null) ? 0 : getNetworkReachabilityDetails().hashCode());
        hashCode = prime * hashCode + ((getPackageVulnerabilityDetails() == null) ? 0 : getPackageVulnerabilityDetails().hashCode());
        hashCode = prime * hashCode + ((getRemediation() == null) ? 0 : getRemediation().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Finding clone() {
        try {
            return (Finding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.FindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
