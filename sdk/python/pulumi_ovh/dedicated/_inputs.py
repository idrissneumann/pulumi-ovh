# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'ServerInstallTaskDetailsArgs',
    'ServerInstallTaskUserMetadataArgs',
    'ServerNetworkingInterfaceArgs',
]

@pulumi.input_type
class ServerInstallTaskDetailsArgs:
    def __init__(__self__, *,
                 custom_hostname: Optional[pulumi.Input[str]] = None,
                 disk_group_id: Optional[pulumi.Input[int]] = None,
                 language: Optional[pulumi.Input[str]] = None,
                 no_raid: Optional[pulumi.Input[bool]] = None,
                 post_installation_script_link: Optional[pulumi.Input[str]] = None,
                 post_installation_script_return: Optional[pulumi.Input[str]] = None,
                 soft_raid_devices: Optional[pulumi.Input[int]] = None,
                 use_spla: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[str] custom_hostname: Set up the server using the provided hostname instead of the default hostname.
        :param pulumi.Input[int] disk_group_id: Disk group id.
        :param pulumi.Input[str] language: Deprecated, will be removed in next release.
        :param pulumi.Input[bool] no_raid: Set to true to disable RAID.
        :param pulumi.Input[str] post_installation_script_link: Indicate the URL where your postinstall customisation script is located.
        :param pulumi.Input[str] post_installation_script_return: Indicate the string returned by your postinstall customisation script on successful execution. Advice: your script should return a unique validation string in case of succes. A good example is 'loh1Xee7eo OK OK OK UGh8Ang1Gu'.
        :param pulumi.Input[int] soft_raid_devices: soft raid devices.
        :param pulumi.Input[bool] use_spla: Deprecated, will be removed in next release.
               
               The `user_metadata` block supports many arguments, here is a non-exhaustive list depending on the OS:
               
               -[see OS questions](https://help.ovhcloud.com/csm/en-dedicated-servers-api-os-installation?id=kb_article_view&sysparm_article=KB0061951#os-questions)
               
               -[see api](https://eu.api.ovh.com/console-preview/?section=%2Fdedicated%2FinstallationTemplate&branch=v1#get-/dedicated/installationTemplate/-templateName-)
               
               -[see documentation](https://help.ovhcloud.com/csm/en-ie-dedicated-servers-api-os-installation?id=kb_article_view&sysparm_article=KB0061950#create-an-os-installation-task) to get more information
        """
        if custom_hostname is not None:
            pulumi.set(__self__, "custom_hostname", custom_hostname)
        if disk_group_id is not None:
            pulumi.set(__self__, "disk_group_id", disk_group_id)
        if language is not None:
            warnings.warn("""This field is deprecated and will be removed in a future release""", DeprecationWarning)
            pulumi.log.warn("""language is deprecated: This field is deprecated and will be removed in a future release""")
        if language is not None:
            pulumi.set(__self__, "language", language)
        if no_raid is not None:
            pulumi.set(__self__, "no_raid", no_raid)
        if post_installation_script_link is not None:
            pulumi.set(__self__, "post_installation_script_link", post_installation_script_link)
        if post_installation_script_return is not None:
            pulumi.set(__self__, "post_installation_script_return", post_installation_script_return)
        if soft_raid_devices is not None:
            pulumi.set(__self__, "soft_raid_devices", soft_raid_devices)
        if use_spla is not None:
            warnings.warn("""This field is deprecated and will be removed in a future release""", DeprecationWarning)
            pulumi.log.warn("""use_spla is deprecated: This field is deprecated and will be removed in a future release""")
        if use_spla is not None:
            pulumi.set(__self__, "use_spla", use_spla)

    @property
    @pulumi.getter(name="customHostname")
    def custom_hostname(self) -> Optional[pulumi.Input[str]]:
        """
        Set up the server using the provided hostname instead of the default hostname.
        """
        return pulumi.get(self, "custom_hostname")

    @custom_hostname.setter
    def custom_hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_hostname", value)

    @property
    @pulumi.getter(name="diskGroupId")
    def disk_group_id(self) -> Optional[pulumi.Input[int]]:
        """
        Disk group id.
        """
        return pulumi.get(self, "disk_group_id")

    @disk_group_id.setter
    def disk_group_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "disk_group_id", value)

    @property
    @pulumi.getter
    def language(self) -> Optional[pulumi.Input[str]]:
        """
        Deprecated, will be removed in next release.
        """
        warnings.warn("""This field is deprecated and will be removed in a future release""", DeprecationWarning)
        pulumi.log.warn("""language is deprecated: This field is deprecated and will be removed in a future release""")

        return pulumi.get(self, "language")

    @language.setter
    def language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "language", value)

    @property
    @pulumi.getter(name="noRaid")
    def no_raid(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to true to disable RAID.
        """
        return pulumi.get(self, "no_raid")

    @no_raid.setter
    def no_raid(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "no_raid", value)

    @property
    @pulumi.getter(name="postInstallationScriptLink")
    def post_installation_script_link(self) -> Optional[pulumi.Input[str]]:
        """
        Indicate the URL where your postinstall customisation script is located.
        """
        return pulumi.get(self, "post_installation_script_link")

    @post_installation_script_link.setter
    def post_installation_script_link(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "post_installation_script_link", value)

    @property
    @pulumi.getter(name="postInstallationScriptReturn")
    def post_installation_script_return(self) -> Optional[pulumi.Input[str]]:
        """
        Indicate the string returned by your postinstall customisation script on successful execution. Advice: your script should return a unique validation string in case of succes. A good example is 'loh1Xee7eo OK OK OK UGh8Ang1Gu'.
        """
        return pulumi.get(self, "post_installation_script_return")

    @post_installation_script_return.setter
    def post_installation_script_return(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "post_installation_script_return", value)

    @property
    @pulumi.getter(name="softRaidDevices")
    def soft_raid_devices(self) -> Optional[pulumi.Input[int]]:
        """
        soft raid devices.
        """
        return pulumi.get(self, "soft_raid_devices")

    @soft_raid_devices.setter
    def soft_raid_devices(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "soft_raid_devices", value)

    @property
    @pulumi.getter(name="useSpla")
    def use_spla(self) -> Optional[pulumi.Input[bool]]:
        """
        Deprecated, will be removed in next release.

        The `user_metadata` block supports many arguments, here is a non-exhaustive list depending on the OS:

        -[see OS questions](https://help.ovhcloud.com/csm/en-dedicated-servers-api-os-installation?id=kb_article_view&sysparm_article=KB0061951#os-questions)

        -[see api](https://eu.api.ovh.com/console-preview/?section=%2Fdedicated%2FinstallationTemplate&branch=v1#get-/dedicated/installationTemplate/-templateName-)

        -[see documentation](https://help.ovhcloud.com/csm/en-ie-dedicated-servers-api-os-installation?id=kb_article_view&sysparm_article=KB0061950#create-an-os-installation-task) to get more information
        """
        warnings.warn("""This field is deprecated and will be removed in a future release""", DeprecationWarning)
        pulumi.log.warn("""use_spla is deprecated: This field is deprecated and will be removed in a future release""")

        return pulumi.get(self, "use_spla")

    @use_spla.setter
    def use_spla(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "use_spla", value)


@pulumi.input_type
class ServerInstallTaskUserMetadataArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[str],
                 value: pulumi.Input[str]):
        """
        :param pulumi.Input[str] key: The key for the user_metadata
        :param pulumi.Input[str] value: The value for the user_metadata
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def key(self) -> pulumi.Input[str]:
        """
        The key for the user_metadata
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[str]):
        pulumi.set(self, "key", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        The value for the user_metadata
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class ServerNetworkingInterfaceArgs:
    def __init__(__self__, *,
                 macs: pulumi.Input[Sequence[pulumi.Input[str]]],
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] macs: Interface Mac address
        :param pulumi.Input[str] type: Interface type
        """
        pulumi.set(__self__, "macs", macs)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def macs(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Interface Mac address
        """
        return pulumi.get(self, "macs")

    @macs.setter
    def macs(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "macs", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Interface type
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


