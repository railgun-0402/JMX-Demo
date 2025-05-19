## JMX-Demo
### 内容 
JMXを学ぶための簡単なハンズオン。

k8s環境にデプロイして監視等を実施する。

## 使用技術(作成中なので予定も含む)
### バックエンド
<img src="https://skillicons.dev/icons?i=java,spring" /> <br /><br />

### その他インフラ
<img src="https://skillicons.dev/icons?i=docker,k8s,ecs" /> <br /><br />



1. **シンプルなSpring Bootアプリケーションを作成**
    - JMXを利用できるように設定し、メトリクスを提供するMBeanを作成します。
2. **Kubernetesにデプロイ**
    - 作成したSpring BootアプリケーションをDockerイメージとしてビルドし、Kubernetesクラスタにデプロイ
3. **メトリクスをモニタリングする**
    - Kubernetes内でJMXメトリクスを収集し、PrometheusやGrafanaなどのツールを使って可視化
4. **Graceful Shutdownのテスト**
    - Kubernetes上でのアプリケーションのシャットダウンをシミュレートし、JMXを通じてリクエストの処理状況を確認します。
