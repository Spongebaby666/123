# ZombieHealth Plugin

一个Bukkit 1.21.1插件，用于设置僵尸的血量为100点。

## 功能特性

- ✅ 所有生成的僵尸自动获得100点血量
- ✅ 支持Bukkit 1.21.1版本
- ✅ 轻量级且高效
- ✅ 包含管理命令

## 安装步骤

1. **构建插件**
   ```bash
   mvn clean package
   ```

2. **复制JAR文件**
   - 将生成的 `target/zombie-health-plugin-1.0.0.jar` 复制到服务器的 `plugins` 文件夹

3. **重启服务器**
   ```bash
   /reload confirm
   ```
   或完全重启服务器

## 使用命令

### 查看插件状态
```
/zombiehealth status
```
显示插件信息和当前世界中的僵尸数量

### 重新加载插件
```
/zombiehealth reload
```
重新加载插件配置

## 工作原理

- 监听 `EntitySpawnEvent` 事件
- 当僵尸生成时，自动设置其：
  - 当前血量：100 HP
  - 最大血量：100 HP

## 需求

- Java 21 或更高版本
- Bukkit 1.21.1 或 Paper 1.21.1

## 开发

项目使用Maven进行构建管理。

### 项目结构
```
zombie-health-plugin/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/zombiehealth/
│       │       ├── ZombieHealthPlugin.java
│       │       ├── ZombieListener.java
│       │       └── ZombieCommand.java
│       └── resources/
│           └── plugin.yml
└── pom.xml
```

## 许可证

MIT License

## 作者

Spongebaby666
