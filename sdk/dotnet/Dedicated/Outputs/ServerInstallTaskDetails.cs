// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace scraly.Ovh.Dedicated.Outputs
{

    [OutputType]
    public sealed class ServerInstallTaskDetails
    {
        /// <summary>
        /// Template change log details.
        /// </summary>
        public readonly string? ChangeLog;
        /// <summary>
        /// Set up the server using the provided hostname instead of the default hostname.
        /// </summary>
        public readonly string? CustomHostname;
        /// <summary>
        /// Disk group id.
        /// </summary>
        public readonly int? DiskGroupId;
        /// <summary>
        /// set to true to install RTM.
        /// </summary>
        public readonly bool? InstallRtm;
        /// <summary>
        /// set to true to install sql server (Windows template only).
        /// </summary>
        public readonly bool? InstallSqlServer;
        /// <summary>
        /// language.
        /// </summary>
        public readonly string? Language;
        /// <summary>
        /// set to true to disable RAID.
        /// </summary>
        public readonly bool? NoRaid;
        /// <summary>
        /// Indicate the URL where your postinstall customisation script is located.
        /// </summary>
        public readonly string? PostInstallationScriptLink;
        /// <summary>
        /// Indicate the string returned by your postinstall customisation script on successful execution. Advice: your script should return a unique validation string in case of succes. A good example is 'loh1Xee7eo OK OK OK UGh8Ang1Gu'.
        /// </summary>
        public readonly string? PostInstallationScriptReturn;
        /// <summary>
        /// set to true to make a hardware raid reset.
        /// </summary>
        public readonly bool? ResetHwRaid;
        /// <summary>
        /// soft raid devices.
        /// </summary>
        public readonly int? SoftRaidDevices;
        /// <summary>
        /// Name of the ssh key that should be installed. Password login will be disabled.
        /// </summary>
        public readonly string? SshKeyName;
        /// <summary>
        /// Use the distribution's native kernel instead of the recommended OVHcloud Kernel.
        /// </summary>
        public readonly bool? UseDistribKernel;
        /// <summary>
        /// set to true to use SPLA.
        /// </summary>
        public readonly bool? UseSpla;

        [OutputConstructor]
        private ServerInstallTaskDetails(
            string? changeLog,

            string? customHostname,

            int? diskGroupId,

            bool? installRtm,

            bool? installSqlServer,

            string? language,

            bool? noRaid,

            string? postInstallationScriptLink,

            string? postInstallationScriptReturn,

            bool? resetHwRaid,

            int? softRaidDevices,

            string? sshKeyName,

            bool? useDistribKernel,

            bool? useSpla)
        {
            ChangeLog = changeLog;
            CustomHostname = customHostname;
            DiskGroupId = diskGroupId;
            InstallRtm = installRtm;
            InstallSqlServer = installSqlServer;
            Language = language;
            NoRaid = noRaid;
            PostInstallationScriptLink = postInstallationScriptLink;
            PostInstallationScriptReturn = postInstallationScriptReturn;
            ResetHwRaid = resetHwRaid;
            SoftRaidDevices = softRaidDevices;
            SshKeyName = sshKeyName;
            UseDistribKernel = useDistribKernel;
            UseSpla = useSpla;
        }
    }
}
