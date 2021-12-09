[![](http://img.shields.io/discord/833693644501286993?label=Discord&style=flat&logo=discord)](https://discord.gg/uueEqzwCJJ)

<div align="center">
  <img src="https://i.imgur.com/KFkMZ9D.png"> 
  <div>
    <a href="https://github.com/plasmoapp/matter/">GitHub</a>
    <span> | </span>
    <a href="https://matter.plo.su/job/Matter-1.18/">Download</a>
    <span> | </span>
    <a href="https://discord.com/invite/uueEqzwCJJ">Discord</a>
  </div>
</div>

# Matter

Matter is a [Paper]() fork that currently only adds what we call a **secure feature seed**. Based on [Secure Seed](https://github.com/Earthcomputer/SecureSeed) mod by Earthcomputer.  

Terrain and biome generation remains the same, but all the ores and structures are generated with 1024-bit seed, instead of the usual 64-bit seed. This seed is almost impossible to crack, and there are no weird links between structures. Like a link between diamonds and clay. 

**Warning:** Developers of this project are absolutely clueless about both server core development and cryptography or whatever. We use it for a production server and didn't run into any major issues, but you should use it only at your own risk. Every claim on this page may be false, and if you run this core, your server may explode. Really, we are not sure, but it can be unstable. 

## Detailed description

Originally it was just a port of Secure Seed. A mod that changes default 64-bit seed to a 1024-bit seed, making it almost impossible to crack the seed. Not only that, there are a lot of things changed related to how random generation works. It's pretty complicated, there are a lot of terms, that we don't understand either. But generally, it means that:

- Seed is impossible to crack without a data center.

- There is no link between the generation of different features. For example, a link between diamonds and clay. 

We made a complete port of Secure Seed for 1.17. But when we tried to port it to 1.18, terrain generation just didn't work properly, and there were a lot of issues. Instead, we decided to keep most of the generation as it is, and only change the way structures and ores are generated. That's why it's called 'secure feature seed'. 

The terrain and biomes stays the same. But all the ores, structures, villages, strongholds, spawners, clay patches, geodes, lava pools, slime chunks — would appear in different places from the original seed. Because they are generated with all the fancy technology from the Secure Seed mod. Meaning there is no way that players can abuse the seed to find ores or structures. 

We are also planning to add an ability to change seed for the biome generation. Maybe an ability to change the whole generation, like it was in the original mod. And also make it more customizable. But for now it just works. 

## How to use

Use it as you would use a Paper server core. You run it and it works. 

It generates a feature seed randomly and stores it in a custom field in the `level.dat` file.

## Download

[Click here to download from Jenkins](https://matter.plo.su/job/Matter-1.18/)
